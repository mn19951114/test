package com.example.wx.appbackend.user.dao;

import com.example.wx.appbackend.user.entity.WxUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WxUserDao {
    int deleteByPrimaryKey(Long key);

    int insert(WxUser record);

    int insertSelective(WxUser record);

    WxUser selectByPrimaryKey(Long key);

    int updateByPrimaryKeySelective(WxUser record);

    int updateByPrimaryKey(WxUser record);
}