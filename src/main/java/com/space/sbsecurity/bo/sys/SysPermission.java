package com.space.sbsecurity.bo.sys;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author zhuzhe
 * @date 2018/5/10 11:11
 * @email 1529949535@qq.com
 */
@Data
public class SysPermission implements GrantedAuthority{

    private Long id;

    //权限名称
    private String name;

    //权限描述
    private String description;

    //授权链接
    private String url;

    //父节点id
    private Long pid;

    //请求方法
    private String method;

    @Override
    public String getAuthority() {
        return name;
    }
}
