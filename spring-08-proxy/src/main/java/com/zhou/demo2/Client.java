package com.zhou.demo2;

/**
 * @Description:
 * @Date: 2020/7/29 19:49
 **/
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.add();
    }
}
