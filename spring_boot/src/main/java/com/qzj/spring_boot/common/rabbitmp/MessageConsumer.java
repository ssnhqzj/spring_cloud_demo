package com.qzj.spring_boot.common.rabbitmp;


import com.qzj.spring_boot.common.rabbitmp.common.DetailRes;

/**
 * Created by littlersmall on 16/5/12.
 */
public interface MessageConsumer {
    DetailRes consume();
}
