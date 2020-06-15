package com.kenny.kabang.samplespringbootdatastarter.mapper;

import com.kenny.kabang.samplespringbootdatastarter.domain.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {

    Users findUsersById(String id);
    void saveUsers(Users users);
}
