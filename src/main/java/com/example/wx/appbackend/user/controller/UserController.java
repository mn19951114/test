package com.example.wx.appbackend.user.controller;

import com.example.wx.appbackend.user.entity.WxUser;
import com.example.wx.appbackend.user.service.WxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private WxUserService wxUserService;

    @GetMapping("/get")
    public WxUser getUser(@RequestParam("id") Long id)throws Exception{
        return wxUserService.get(id);
    }


}
