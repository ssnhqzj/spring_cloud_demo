package com.qzj.spring_boot.common.rabbitmp;


import com.qzj.spring_boot.common.rabbitmp.common.DetailRes;

/**
 * Created by littlersmall on 16/5/11.
 */
public interface MessageProcess<T> {
    DetailRes process(T message);
}
