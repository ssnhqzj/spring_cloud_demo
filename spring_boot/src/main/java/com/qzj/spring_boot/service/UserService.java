package com.qzj.spring_boot.service;

import com.qzj.spring_boot.bean.User;

public interface UserService {
    User getUser(String username);
    User findUserByUserName(String username);
}
