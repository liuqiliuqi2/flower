package com.nf511.flower.dao;

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
public class OrderDaoTest {

    @Autowired
    OrderDao orderDao;

    @Test
    public void insertOrder() {
    }

    @Test
    public void selectAllOrderId() {

    }

    @Test
    public void selectAllOrder() {

        System.out.println(orderDao.selectAllOrder(100000000));

    }
}