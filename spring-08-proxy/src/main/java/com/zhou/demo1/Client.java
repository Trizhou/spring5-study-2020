package com.zhou.demo1;

/**
 * @Description:
 * @Date: 2020/7/29 19:30
 **/
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //代理
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
