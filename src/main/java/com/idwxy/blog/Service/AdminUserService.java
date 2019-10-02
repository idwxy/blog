package com.idwxy.blog.Service;

import com.idwxy.blog.entity.AdminUser;

public interface AdminUserService {

    /**
     * 登录接口
     * @param userName
     * @param password
     * @return
     */
    AdminUser login(String userName, String password);
}
