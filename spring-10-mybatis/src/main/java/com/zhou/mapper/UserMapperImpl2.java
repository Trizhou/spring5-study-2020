package com.zhou.mapper;

import com.zhou.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Description:
 * @Date: 2020/8/4 17:46
 **/
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    public List<User> selectUser() {
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
