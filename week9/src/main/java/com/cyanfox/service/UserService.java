package com.cyanfox.service;


import com.cyanfox.dao.UserMapper;
import com.cyanfox.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    //用户注册
    public void register(User user) {
        //调用 dao 层的方法
        //TODO：在注册的时候取出手机号去判断此手机号是否被注册（拓展功能，学员 自己去实现）

        userMapper.register(user);
    }

    //用户登录
    public boolean login(String mobile, String password) {
        //调用 dao 层的方法
        User user = userMapper.login(mobile,password);
        if(user==null){
            return false;
        }else {
            return true;
        }
    }

    //查询用户信息
    public User findById(int id) {
        //调用 dao 层的方法
        return userMapper.findById(id);
    }
}