package com.m2on.study.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * @Author: HuLiang
 * @Date: 2024/07/15/23:39
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ControllerLogPO {
    private String logId;
    private String url;
    private String host;
    private String ip;
    private String describe;
}
