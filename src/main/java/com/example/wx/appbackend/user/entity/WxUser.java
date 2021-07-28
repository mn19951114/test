package com.example.wx.appbackend.user.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * wx_user
 * @author 
 */
@Data
public class WxUser implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * 性别 男M 女W 默认值M
     */
    private String sex;

    /**
     * 有效标识
     */
    private String enabledFlag;

    private String name;

    private Date lastLogin;

    private static final long serialVersionUID = 1L;
}