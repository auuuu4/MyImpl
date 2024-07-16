package com.m2on.study.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * @Author: HuLiang
 * @Date: 2024/07/15/19:27
 * @Description:
 */
@Component
@Aspect
public class ControllerAspect {

    @Pointcut("@annotation(com.m2on.study.annotation.RecordMethod)")
    public void controllerPointcut(){

    }

    @Before("controllerPointcut()")
    public void BeforeController(){

        System.out.println("Controller 前置记录");
    }
}
