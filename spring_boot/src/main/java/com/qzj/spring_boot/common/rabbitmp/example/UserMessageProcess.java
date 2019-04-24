package com.qzj.spring_boot.common.rabbitmp.example;

import com.qzj.spring_boot.common.rabbitmp.MessageProcess;
import com.qzj.spring_boot.common.rabbitmp.common.DetailRes;

/**
 * Created by littlersmall on 16/6/28.
 */
public class UserMessageProcess implements MessageProcess<UserMessage> {
    @Override
    public DetailRes process(UserMessage userMessage) {
        System.out.println(userMessage);

        return new DetailRes(true, "");
    }
}
