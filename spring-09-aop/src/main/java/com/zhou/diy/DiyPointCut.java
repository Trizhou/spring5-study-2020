package com.zhou.diy;

/**
 * @Description:
 * @Date: 2020/7/30 9:49
 **/
public class DiyPointCut {
    public void before() {
        System.out.println("===方法执行前===");
    }

    public void after() {
        System.out.println("===方法执行后===");
    }
}
