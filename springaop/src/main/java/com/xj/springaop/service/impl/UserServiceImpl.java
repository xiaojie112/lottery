package com.xj.springaop.service.impl;

import com.xj.springaop.annotation.MyAnnotation;
import com.xj.springaop.other.User;
import com.xj.springaop.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-19
 */
@Service
public class UserServiceImpl implements IUserService {

    @Override
    public int addUser() throws Exception{
        System.out.println("添加用户");
//        throw new RuntimeException("抛出运行时异常");
        return 1;
    }

    @Override
    public void deleteUser(User user) {
        System.out.println("删除用户");
    }

    @Override
    public void updateUser(String s, int num) {
        System.out.println("更新用户");
    }

    @MyAnnotation(info = "abcd")
    @Override
    public void selectUser(String test) {
        System.out.println("查询用户");
    }
}
