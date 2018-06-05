package com.space.sbsecurity.mapper.sys;

import com.space.sbsecurity.bo.sys.SysPermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhuzhe
 * @date 2018/5/10 13:37
 * @email 1529949535@qq.com
 */
@Component
@Mapper
public interface SysPermissionMapper {

    List<SysPermission> selectPermissionByRoleId(Long roleId);

    List<SysPermission> findAll();
}
