package com.pace.springsecurityjwt.repository;

import com.pace.springsecurityjwt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUserName(String username);
}
