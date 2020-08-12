package com.zhou.demo2;

/**
 * @Description:
 * @Date: 2020/7/29 19:49
 **/
public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    //打印日志
    public void log(String msg) {
        System.out.println("调用了" + msg + "!");
    }
}
