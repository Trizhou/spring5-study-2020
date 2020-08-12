package com.zhou.mapper;

import com.zhou.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @Description:
 * @Date: 2020/8/4 17:20
 **/
public class UserMapperImpl implements UserMapper{
    /*我们所有的操作都使用sqlSession来执行,在原来。现在都是用sqlSessionTemplate;*/
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
