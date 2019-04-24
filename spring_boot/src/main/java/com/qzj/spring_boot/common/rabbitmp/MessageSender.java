package com.qzj.spring_boot.common.rabbitmp;


import com.qzj.spring_boot.common.rabbitmp.common.DetailRes;
import com.qzj.spring_boot.common.rabbitmp.common.MessageWithTime;

/**
 * Created by littlersmall on 16/5/12.
 */
public interface MessageSender {
    DetailRes send(Object message);

    DetailRes send(MessageWithTime messageWithTime);
}
