package com.kenny.kabang.samplespringbootdatastarter.dao;

import com.kenny.kabang.samplespringbootdatastarter.domain.Users;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDao {

    @Autowired
    private SqlSession sqlSession;

    public Users findUsersById(String id) {
        return sqlSession.selectOne("findUsersById", id);
    }
    public void saveUsers(Users users) {
        sqlSession.insert("saveUsers", users);
    }

}
