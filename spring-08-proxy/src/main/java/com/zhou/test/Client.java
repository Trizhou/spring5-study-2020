package com.zhou.test;

import com.zhou.demo2.UserService;
import com.zhou.demo2.UserServiceImpl;

/**
 * @Description:
 * @Date: 2020/7/29 20:52
 **/
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setObject(userService);

        UserService proxy = (UserService) pih.getProxy();
        proxy.delete();
    }
}
