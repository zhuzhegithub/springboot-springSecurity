package com.space.sbsecurity.bo.sys;

import lombok.Data;

import java.util.List;

/**
 * @author zhuzhe
 * @date 2018/5/9 16:24
 * @email 1529949535@qq.com
 */
@Data
public class SysUser{

    private Long id;
    private String username;
    private String password;
    private List<SysRole> sysRoles;
}
