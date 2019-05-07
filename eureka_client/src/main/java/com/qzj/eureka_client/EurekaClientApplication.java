package com.qzj.eureka_client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    @RequestMapping("/setsession")
    public String setSession(HttpServletRequest request, @RequestParam(value = "name", defaultValue = "forezp") String name) {
        request.getSession().setAttribute("name", name);
        return "session set success : " + name;
    }

    @RequestMapping("/getsession")
    public String getSession(HttpServletRequest request) {
        return "get name from session, name =  " + request.getSession().getAttribute("name") + " ,i am from port:" + port;
    }
}
