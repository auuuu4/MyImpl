package com.m2on.study.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Target;

/**
 * Created with IntelliJ IDEA.
 * @Author: HuLiang
 * @Date: 2024/07/15/22:54
 * @Description:
 */
@Configuration
public class LogConfig {
    @Value("${study.config.logCode.controller}")
    public String CONTROLLER_CODE;

}
