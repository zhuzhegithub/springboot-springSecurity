package com.space.sbsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author zhuzhe
 * @date 2018/5/9 17:25
 * @email 1529949535@qq.com
 */
@Configuration
public class WebMVCConfig extends WebMvcConfigurationSupport {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        /**
         * 注册访问转向login.HTML页面
         */
        registry.addViewController("/login").setViewName("login");
    }
}
