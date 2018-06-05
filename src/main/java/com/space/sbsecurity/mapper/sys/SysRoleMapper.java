package com.space.sbsecurity.mapper.sys;

import com.space.sbsecurity.bo.sys.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhuzhe
 * @date 2018/5/9 17:49
 * @email 1529949535@qq.com
 */
@Component
@Mapper
public interface SysRoleMapper {

    List<SysRole> selectRoleListByUserId(Long userId);

}
