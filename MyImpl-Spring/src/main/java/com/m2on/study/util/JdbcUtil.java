package com.m2on.study.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * @Author: HuLiang
 * @Date: 2024/07/15/22:40
 * @Description:
 */
@Component
public class JdbcUtil {

    private static JdbcTemplate jdbcTemplate;

    @Autowired
    JdbcUtil(JdbcTemplate template){
        jdbcTemplate = template;
    }

    public static void execute(String sql){
        try {
            jdbcTemplate.execute(sql);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
