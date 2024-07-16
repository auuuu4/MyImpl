package com.m2on.study.service;

import com.m2on.study.domain.ControllerLogPO;
import com.m2on.study.util.JdbcUtil;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * @Author: HuLiang
 * @Date: 2024/07/15/23:42
 * @Description:
 */
@Service
public class ControllerLogService {

    public void insertLog(ControllerLogPO controllerLogDO){
        JdbcUtil.execute("insert into `controller_record`(`log_id`,`host`,`ip`,`url`,`describe`) value('"
                +controllerLogDO.getLogId()+"','"
                +controllerLogDO.getHost()+"','"
                +controllerLogDO.getIp()+"','"
                +controllerLogDO.getUrl()+"','"
                +controllerLogDO.getDescribe()+"');"
        );
    }
}
