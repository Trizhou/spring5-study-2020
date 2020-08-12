package com.zhou.mapper;

import com.zhou.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Description:
 * @Date: 2020/8/4 17:20
 **/
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
    public List<User> selectUser() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = new User(3, "zhou", "z1");
        addUser(user);
        deleteUser(3);

        return mapper.selectUser();
        //return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }


}
