package com.example.wx.appbackend.user.service;

import com.example.wx.appbackend.user.entity.WxUser;

public interface WxUserService {

    WxUser get(Long id)throws Exception;
}
