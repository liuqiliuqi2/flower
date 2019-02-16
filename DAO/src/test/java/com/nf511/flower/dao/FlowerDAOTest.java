package com.nf511.flower.dao;

import com.nf511.flower.entity.Flower;
import com.nf511.flower.entity.Flowerbranchnumber;
import org.junit.After;
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
public class FlowerDAOTest {

    @Autowired
    FlowerDAO flowerDAO;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getFlower() {
        Flower flower=new Flower();
        flower.setSkip(0);
        flower.setSize(28);
        flower.setFlowerId(3);
//        flower.setFlowerUseName("爱情鲜花");
//        flower.setFlowerTypeName("花束");
//        flower.setFlowerBranchNumber("99");
//        flower.setFlowerMaterials("红");
        System.out.println(flowerDAO.getFlower(flower));
    }

    @Test
    public void getFlowerCount() {
        Flower flower=new Flower();
        System.out.println(flowerDAO.getFlowerCount(flower));
    }
}