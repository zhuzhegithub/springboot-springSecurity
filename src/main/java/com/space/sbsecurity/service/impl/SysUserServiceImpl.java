package com.space.sbsecurity.service.impl;

import com.space.sbsecurity.bo.sys.SysPermission;
import com.space.sbsecurity.bo.sys.SysRole;
import com.space.sbsecurity.bo.sys.SysUser;
import com.space.sbsecurity.mapper.sys.SysUserMapper;
import com.space.sbsecurity.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuzhe
 * @date 2018/5/9 17:07
 * @email 1529949535@qq.com
 */
@Transactional(readOnly = true)
@Service
public class SysUserServiceImpl implements SysUserService ,UserDetailsService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findByUsername(String username) {
        return sysUserMapper.findByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser sysUser = sysUserMapper.findByUsername(username);
        if (sysUser == null) {
            throw new RuntimeException("user [" + username + "] does not exit");
        }
        List<SysRole> sysRoles = sysUser.getSysRoles();
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        for (SysRole sysRole : sysRoles) {
            List<SysPermission> permissions = sysRole.getPermissions();
            for (SysPermission permission : permissions) {
                if (permission != null && permission.getName() != null) {
                    grantedAuthorities.add(permission);
                }
            }
        }
        return new User(sysUser.getUsername(), sysUser.getPassword(), grantedAuthorities);
    }
}
