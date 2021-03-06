package com.nf511.flower.dao;

import org.junit.After;
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
public class FlowerbranchnumberDAOTest {

    @Autowired
    FlowerbranchnumberDAO flowerbranchnumberDAO;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAllFlowerbranchnumber() {

        System.out.println(flowerbranchnumberDAO.getAllFlowerbranchnumber());
    }

    @Test
    public void All() {
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        System.out.println(flowerbranchnumberDAO.deleteAll(list));
    }
}