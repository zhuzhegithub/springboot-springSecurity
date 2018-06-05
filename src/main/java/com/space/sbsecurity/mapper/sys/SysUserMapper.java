package com.space.sbsecurity.mapper.sys;

import com.space.sbsecurity.bo.sys.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author zhuzhe
 * @date 2018/5/9 16:31
 * @email 1529949535@qq.com
 */
@Component
@Mapper
public interface SysUserMapper {

    SysUser findByUsername(String username);

}
