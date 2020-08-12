package com.zhou.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Date: 2020/7/29 20:50
 **/
public class ProxyInvocationHandler implements InvocationHandler {
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }
}
