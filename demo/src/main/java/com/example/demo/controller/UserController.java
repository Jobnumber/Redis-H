package com.example.demo.controller;

import com.example.demo.dao.UserJpa;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UserJpa userJpa;
    @RequestMapping("/list")
    @ResponseBody
    //condition = "#id.length()>3"：id的长度大于3进行缓存
    //unless = "#result.size()!=0"返回结果不等于null时缓存，unless代表反
   @Cacheable(cacheNames = "list",key = "#id",condition = "#id.length()>3",unless = "#result.size()==null")
    @CachePut
    @CacheEvict
    public List<User> list(@RequestParam("id")String id){
        List<User> list = userService.list();
        return list;
    }
}
