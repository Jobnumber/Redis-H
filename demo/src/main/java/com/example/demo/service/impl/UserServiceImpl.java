package com.example.demo.service.impl;

import com.example.demo.dao.UserJpa;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserJpa userJpa;

    @Override
    public List<User> list() {
        List<User> all = userJpa.findAll();
        return all;
    }
}
