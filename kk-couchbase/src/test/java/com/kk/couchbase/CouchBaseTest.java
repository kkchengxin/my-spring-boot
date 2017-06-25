package com.kk.couchbase;

import java.util.List;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.kk.couchbase.entity.User;
import com.kk.couchbase.repository.IUserService;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by chengxin on 2017/6/23.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@Slf4j
public class CouchBaseTest {
    @Autowired
    private IUserService userService;

    private String userName ;
    @Before
    public void setUp(){
        userName ="kk";
    }
    @Test
    public void getUserTest(){
//        Iterable<User> all = userService.findAll();
//        log.info("getUserTest={}",all);
        String userName ="kk";
        List<User> user = userService.findByUserName(userName);
        log.info("findByUserName={}",user);
//        List<User> byUserNameAndAgeBetween = userService.findByUserNameAndAgeBetween(userName, 1, 2);
//        log.info("findByUserNameAndAgeBetween={}",byUserNameAndAgeBetween);


    }
    @Test
    public void saveUserTest() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
//        user.setId("6b353aeb-9674-4794-a39c-dd39c5056ece");
        user.setUserName("kk");
        user.setPhone("1581028305");
        user.setAge(0.8f);
        userService.save(user);
    }
}
