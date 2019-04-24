package com.qzj.consumer_feign.service;

import com.qzj.consumer_feign.controller.HiErrorController;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client", fallback = HiErrorController.class)
public interface HiService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/setsession",method = RequestMethod.GET)
    String setSession(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/getsession",method = RequestMethod.GET)
    String getSession();

}
