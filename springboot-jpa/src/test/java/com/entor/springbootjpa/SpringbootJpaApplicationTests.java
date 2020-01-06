package com.entor.springbootjpa;

import com.entor.springbootjpa.dao.UserDao;
import com.entor.springbootjpa.jopo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
class SpringbootJpaApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setName("网二");
        user.setUsername("www");
        user.setPassword("1234");
        User save = userDao.save(user);
        System.out.println(save);
        //List<User> all = userDao.findAll();
        //System.out.println(all);
    }
}
