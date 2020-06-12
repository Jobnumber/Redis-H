package com.example.demo.service.impl;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserService userService;
    @org.junit.Test
    public void list() {
        List<User> list = userService.list();
        for (User user:list){
            System.out.println("user = " + user);
        }
    }
}