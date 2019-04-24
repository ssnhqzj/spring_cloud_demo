package com.qzj.spring_boot.dao;

import com.qzj.spring_boot.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByUsername(String userName);

}
