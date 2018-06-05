package com.space.sbsecurity.config;

import com.space.sbsecurity.mapper.sys.SysPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author zhuzhe
 * @date 2018/5/10 11:17
 * @email 1529949535@qq.com
 */

@Component
public class MyInvocationSecurityMetadataSourceService  implements
        FilterInvocationSecurityMetadataSource {

    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    /**
     * 此方法是为了判定用户请求的url 是否在权限表中，如果在权限表中，
     * 则返回给 decide 方法，用来判定用户是否有此权限。如果不在权限表中则放行。
     * 因为我不想每一次来了请求，都先要匹配一下权限表中的信息是不是包含此url，
     * 我准备直接拦截，不管请求的url 是什么都直接拦截，
     * 然后在MyAccessDecisionManager的decide 方法中做拦截还是放行的决策。
     * 所以此方法的返回值不能返回 null 此处我就随便返回一下。
     * @param object
     * @return
     * @throws IllegalArgumentException
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        Collection<ConfigAttribute> co=new ArrayList<>();
        co.add(new SecurityConfig("null"));
        return co;
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return true;
    }
}
