package com.zhou.demo1;

/**
 * @Description:
 * @Date: 2020/7/29 19:32
 **/
public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        host.rent();
        seeHouse();
        fee();
    }

    //看房
    public void seeHouse() {
        System.out.println("中介带你看房!");
    }

    //收中介费
    public void fee() {
        System.out.println("中介收中介费!");
    }
}
