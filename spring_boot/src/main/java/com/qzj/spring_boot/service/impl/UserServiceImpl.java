package com.qzj.spring_boot.service.impl;


import com.qzj.spring_boot.bean.User;
import com.qzj.spring_boot.service.UserService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Override
    @Cacheable(value = "user", key = "'user_'+#username")
    public User getUser(String username) {
        System.out.println(username + "进入实现类获取数据！");
        return new User("Ttomm", 22);
    }

    @Override
    public User findUserByUserName(String username) {
        return new User("Tom", 22);
    }

}