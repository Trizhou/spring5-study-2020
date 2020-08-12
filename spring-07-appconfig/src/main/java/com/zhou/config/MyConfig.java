package com.zhou.config;

import com.zhou.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: Trizhou
 * @Date: 2020/7/23
 */
@Configuration
@ComponentScan("com.zhou.pojo")
public class MyConfig {
    @Bean
    public User user() {
        return new User();
    }
}
