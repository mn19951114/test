package com.example.wx.appbackend.user.service;

import com.example.wx.appbackend.user.dao.WxUserDao;
import com.example.wx.appbackend.user.entity.WxUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class WxUserServiceImpl implements WxUserService {

    @Resource
    private WxUserDao wxUserDao;

    @Override
    public WxUser get(Long id) throws Exception {
        return wxUserDao.selectByPrimaryKey(id);
    }
}
