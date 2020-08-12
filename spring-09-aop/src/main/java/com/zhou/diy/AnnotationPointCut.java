package com.zhou.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Description: 方式3：使用注解实现AOP
 * @Date: 2020/7/30 15:28
 **/
@Aspect //标注这个类是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.zhou.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("===方法执行前===");
    }

    @After("execution(* com.zhou.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("===方法执行后===");
    }
}
