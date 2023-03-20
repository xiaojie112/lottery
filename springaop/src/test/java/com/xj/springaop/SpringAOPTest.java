package com.xj.springaop;


import com.xj.springaop.other.User;
import com.xj.springaop.service.IUserService;
import com.xj.springaop.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.aop.support.AopUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ClassUtils;

import javax.annotation.Resource;

/**
 * @description:
 * @author：肖杰
 * @date: 2023-03-19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAOPTest {

    @Resource
    IUserService iUserService;

    @Test
    public void test(){
        try {
            System.out.println(iUserService.getClass().getName());
            iUserService.addUser();
            iUserService.selectUser("test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
