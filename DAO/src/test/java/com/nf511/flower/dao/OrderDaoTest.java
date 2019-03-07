package com.nf511.flower.dao;

import com.nf511.flower.common.SerialNumber;
import com.nf511.flower.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

//指定bean注入的配置文件
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
//使用标准的JUnit @RunWith注释来告诉JUnit使用Spring TestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class  OrderDaoTest {

    @Autowired
    OrderDao orderDao;


    @Test
    public void selectAllOrderId() {

        System.out.println(orderDao.selectAllOrderId(1));
    }

    @Test
    public void selectAllOrder() {
        Order order=new Order();
//        order.setUserId(100000000);
        order.setOrderState(8);
        System.out.println(orderDao.selectAllOrder(order));

    }

    @Test
    public void getOrderCount() {
        Order order=new Order();
//        order.setUserId(100000000);
//        order.setOrderState(8);
        System.out.println(orderDao.getOrderCount(order));

    }

    @Test
    public void UpdateOrderState() {
        System.out.println(orderDao.UpdateOrderState(1902170001,4));

    }
    @Test
    public void insertOrder() {
        Order order=new Order();
        order.setOrderState(8);
        order.setOrderDate(new SimpleDateFormat("YYYY-MM-dd").format(new Date()));
        long count=orderDao.getOrderCount(order)+1;

        String s=SerialNumber.Getnum();
        long gnum=Long.valueOf(s);
        long getCount=gnum+count;
        System.out.println(getCount);

//    orderDetailedAddress,orderDeliveryTime,orderDeliveryTimeFrame,orderBuyerName,
//    orderBuyerPhone,orderMailbox,orderGreetingMessage,userId
        Order order1=new Order();
        order1.setOrderId(getCount);
        order1.setOrderPrice(12);
        order1.setOrderConsigneeName("刘琪");
        order1.setOrderConsigneePhone("17679164807");
        order1.setOrderAddress("1");
        order1.setOrderDetailedAddress("11");
        order1.setOrderDeliveryTimeFrame("1");
        order1.setOrderDeliveryTime("2019-03-9");
        order1.setOrderBuyerName("1");
        order1.setOrderBuyerPhone("1");
        order1.setOrderMailbox("1");
        order1.setOrderGreetingMessage("1");
        order1.setUserId(100000000);
        System.out.println(orderDao.insertOrder(order1));

    }

}