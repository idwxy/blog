package com.idwxy.blog.Service.impl;

import com.idwxy.blog.Service.AdminUserService;
import com.idwxy.blog.dao.AdminUserMapper;
import com.idwxy.blog.entity.AdminUser;
import com.idwxy.blog.util.MD5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminUserImpl implements AdminUserService {

    @Resource
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUser login(String userName, String password) {
        String passwordMd5 = MD5Util.MD5Encode(password, "UTF-8");
        return adminUserMapper.login(userName, password);
    }

    @Override
    public AdminUser getUserDetailById(Integer loginUserId) {
        return adminUserMapper.selectByPrimaryKey(loginUserId);
    }

    @Override
    public Boolean updatePassword(Integer loginUserId, String originalPassword, String newPassword) {
        return null;
    }

    @Override
    public Boolean updateName(Integer loginUserId, String loginUserName, String nickName) {
        return null;
    }
}
