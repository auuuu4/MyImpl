package com.m2on.study.controller;

import com.m2on.study.annotation.RecordMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * @Author: HuLiang
 * @Date: 2024/07/15/20:52
 * @Description:
 */
@RestController
@RecordMethod(describe = "测试 Controller ")
public class TestController {
    @RecordMethod(describe = "test 接口")
    @GetMapping("/test")
    public void test(){

    }
}
