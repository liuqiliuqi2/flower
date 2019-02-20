package com.nf511.flower.dao;

import com.nf511.flower.entity.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


//指定bean注入的配置文件
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTest {

    @Autowired
    UserDao userDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void selectByUserName() {
        System.out.println(userDao.selectByUserPhoneAndMailbox("2392573484@qq.com"));
    }


    @Test
    public void selectUserId() {
        System.out.println(userDao.selectUserId(100000000));
    }
    @Test
    public void updateUser() {
        User user=new User();
        user.setUserName("刘琪");
        user.setUserId(100000000);
        Assert.assertEquals(1, userDao.updateUser(user));
    }
}