package com.qzj.consumer_feign.controller;

import com.qzj.consumer_feign.service.HiService;
import org.springframework.stereotype.Component;

@Component
public class HiErrorController implements HiService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }

    @Override
    public String setSession(String name) {
        return "sorry";
    }

    @Override
    public String getSession() {
        return "sorry";
    }

}
