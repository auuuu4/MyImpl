package com.m2on.study.config;

import com.m2on.study.interceptor.ControllerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created with IntelliJ IDEA.
 * @Author: HuLiang
 * @Date: 2024/07/16/11:59
 * @Description:
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {
    @Autowired
    ControllerInterceptor controllerInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(controllerInterceptor).addPathPatterns("/**");

    }
}
