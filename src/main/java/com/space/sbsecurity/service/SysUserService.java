package com.space.sbsecurity.service;

import com.space.sbsecurity.bo.sys.SysUser;

/**
 * @author zhuzhe
 * @date 2018/5/9 17:06
 * @email 1529949535@qq.com
 */
public interface SysUserService {

    SysUser findByUsername(String username);

}
