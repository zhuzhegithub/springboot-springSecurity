package com.space.sbsecurity.controller.sys;

import com.space.sbsecurity.vo.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhuzhe
 * @date 2018/5/10 8:44
 * @email 1529949535@qq.com
 */
@Controller
public class LoginController {

    @GetMapping("/")
    public String index(Model model){
        Msg msg = new Msg();
        msg.setTitle("测试");
        msg.setContent("zhuzhe");
        msg.setEtraInfo("12345678");
        model.addAttribute("msg",msg);
        return "/home";
    }
}
