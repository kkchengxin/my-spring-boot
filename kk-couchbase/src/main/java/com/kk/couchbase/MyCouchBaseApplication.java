package com.kk.couchbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by chengxin on 2017/6/23.
 */
@Slf4j
//@EnableCouchbaseRepositories(basePackages = { "com.kk.couchbase.repository" })
@SpringBootApplication
public class MyCouchBaseApplication  {

//    @Autowired
//    private IUserService userService;

    public static void main(String[] args) {
        SpringApplication.run(MyCouchBaseApplication.class,args);
        log.info("MyCouchBaseApplication start");
    }

//    @Override
//    public void run(String... args) throws Exception {
//        userService.deleteAll();
//        User user = saveUser();
//        System.out.println(userService.findOne(user.getId()));
//    }
//
//    private User saveUser() {
//        User user = new User();
//        user.setId(UUID.randomUUID().toString());
//        user.setUserName("kk");
//        user.setPhone("1581028");
//        return userService.save(user);
//    }

}
