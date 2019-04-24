package com.qzj.consumer_feign.controller;

import com.qzj.consumer_feign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    HiService hiService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return hiService.sayHiFromClientOne(name) + "feign";
    }

    @GetMapping(value = "/setsession")
    public String setSession(@RequestParam String name) {
        return hiService.setSession(name);
    }

    @GetMapping(value = "/getsession")
    public String getSession() {
        return hiService.getSession();
    }

}
