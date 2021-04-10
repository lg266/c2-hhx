package com.cyanfox.dao;


import com.cyanfox.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    //用户注册
    void register(User user);

    //用户登录
    User login(@Param("mobile") String mobile,@Param("password") String password);

    //查询用户信息
    User findById(@Param("id") int id);
}