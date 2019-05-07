package com.qzj.consumer_feign.controller;

import com.qzj.consumer_feign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

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
    public String setSession(HttpServletRequest request) {
        request.getSession().setAttribute("name","qzj");
        return "session: name=qzj已设置";
    }

    @GetMapping(value = "/getsession")
    public String getSession(HttpServletRequest request) {
        return "获取session: name="+request.getSession().getAttribute("name");
    }

}
