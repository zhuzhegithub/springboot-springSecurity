package com.space.sbsecurity.controller.sys;

import com.space.sbsecurity.bo.sys.SysUser;
import com.space.sbsecurity.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhuzhe
 * @date 2018/5/9 17:08
 * @email 1529949535@qq.com
 */
@RequestMapping("/sys/user")
@RestController
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/{username}")
    public SysUser get(@PathVariable("username") String username){
        return sysUserService.findByUsername(username);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getList(){
        return "hello getList";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String save(){
        return "hello save";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String update(){
        return "hello update";
    }
}
