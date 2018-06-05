package com.space.sbsecurity.bo.sys;

import lombok.Data;

import java.util.List;

/**
 * @author zhuzhe
 * @date 2018/5/9 16:22
 * @email 1529949535@qq.com
 */
@Data
public class SysRole {

    private Long id;

    private String name;

    private String desc;

    private List<SysPermission> permissions;
}
