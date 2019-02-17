package com.nf511.flower.dao;

import com.nf511.flower.entity.Cart;
import com.nf511.flower.entity.Orderflower;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


//指定bean注入的配置文件
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class OrderflowerDaoTest {

    @Autowired
    OrderflowerDao orderflowerDao;


    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insertOrderflower() {
        List cartId=new ArrayList();
        cartId.add(3);
        cartId.add(4);
        Assert.assertEquals(2, orderflowerDao.insertOrderflower(cartId));
        System.out.println(cartId);
    }

    @Test
    public void updateOrderflowerBycartId() {
        List cartId=new ArrayList();
        cartId.add(3);
        cartId.add(4);
        Assert.assertEquals(2, orderflowerDao.updateOrderflowerBycartId(1,cartId));
        System.out.println(cartId);
    }

    @Test
    public void deleteAll() {
        List list=new ArrayList();
        list.add(31);
        list.add(32);
        System.out.println(orderflowerDao.deleteAll(list));
    }

    @Test
    public void selectAllByOrderId() {
        System.out.println(orderflowerDao.selectAllByOrderId(1));
    }
}