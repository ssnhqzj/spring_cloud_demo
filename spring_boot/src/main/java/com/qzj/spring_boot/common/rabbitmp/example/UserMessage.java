package com.qzj.spring_boot.common.rabbitmp.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by littlersmall on 16/6/28.
 */
//for example
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMessage {
    int id;
    String name;
}
