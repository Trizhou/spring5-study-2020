package com.zhou.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Trizhou
 * @Date: 2020/7/23
 */
//等价于 <bean id="user" class="com.zhou.pojo.User"/>
@Component
public class User {
    //相当于<property name="name" value="zhou"/>
    @Value("zhou")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
