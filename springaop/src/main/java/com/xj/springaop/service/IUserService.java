package com.xj.springaop.service;

import com.xj.springaop.other.User;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-19
 */
public interface IUserService {
    public int addUser() throws Exception;

    public void deleteUser(User user);

    public void updateUser(String s, int num);

    public void selectUser(String test);
}
