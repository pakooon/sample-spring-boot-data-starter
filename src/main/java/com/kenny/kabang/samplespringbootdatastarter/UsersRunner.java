package com.kenny.kabang.samplespringbootdatastarter;

import com.kenny.kabang.samplespringbootdatastarter.dao.UsersDao;
import com.kenny.kabang.samplespringbootdatastarter.domain.Users;
import com.kenny.kabang.samplespringbootdatastarter.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class UsersRunner implements ApplicationRunner {

    @Autowired
    UsersMapper usersMapper;

    @Autowired
    UsersDao usersDao;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        //객체생성
        Users users = new Users();
        users.setId("kenny");
        users.setName("dongkyoon");
        users.setAge(34l);

        //INERT
        System.out.println("=========================================");
//        usersMapper.saveUsers(users);
        usersDao.saveUsers(users);

        //SELECT
        System.out.println("=========================================");
//        Users userById = usersMapper.findUsersById(users.getId());
        Users userById = usersDao.findUsersById(users.getId());
        System.out.println(userById.toString());
    }
}
