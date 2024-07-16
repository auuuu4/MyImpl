package com.m2on.study.interceptor;

import com.m2on.study.annotation.RecordMethod;
import com.m2on.study.config.LogConfig;
import com.m2on.study.domain.ControllerLogPO;
import com.m2on.study.service.ControllerLogService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created with IntelliJ IDEA.
 * @Author: HuLiang
 * @Date: 2024/07/15/22:47
 * @Description:
 */

@Component
public class ControllerInterceptor implements HandlerInterceptor {
    @Autowired
    LogConfig config;
    @Autowired
    ControllerLogService controllerogService;
    private String nowTimeString(){
        return DateTimeFormatter.ofPattern("yyyyMMddHHmmss").format(LocalDateTime.now());
    }
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器： "+handler.getClass().getName());
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        // 无需记录的请求
        Annotation annotation = handlerMethod.getMethodAnnotation(RecordMethod.class);
        if(annotation == null){
            return  true;
        }

        Method method = handlerMethod.getMethod();

        String url = String.valueOf(request.getRequestURL());
        String logId = config.CONTROLLER_CODE+nowTimeString();
        String host = request.getRemoteHost();
        String ip = request.getRemoteAddr();
        String describe = (String) annotation.getClass().getMethod("describe").invoke(annotation);

        controllerogService.insertLog(new ControllerLogPO(logId,url,host,ip,describe));
        // 可以进行路径、参数、黑名单、权限检查等等 .....
        return true;
    }
}
