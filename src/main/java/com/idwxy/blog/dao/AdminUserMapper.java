package com.idwxy.blog.dao;

import com.idwxy.blog.entity.AdminUser;
import org.apache.ibatis.annotations.Param;

public interface AdminUserMapper {

    /**
     * 登录方法
     * @param userName
     * @param password
     * @return
     */
    AdminUser login(@Param("userName") String userName,@Param("password") String password);
    int deleteByPrimaryKey(Integer id);

    int insert(AdminUser record);

    int insertSelective(AdminUser record);

    AdminUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminUser record);

    int updateByPrimaryKey(AdminUser record);
}