package com.nf511.flower.dao;


import com.nf511.flower.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {

    int insertOrder(Order order);
    Order selectAllOrderId(@Param("orderId") int orderId);
    List<Order> selectAllOrder(@Param("userId") int userId);



    List<Order>selectAllOrderByPage(@Param("pagelimit") int pagelimit, @Param("size") int size);
    int updateOrder(Order order);
    int deleteOrder(@Param("orderId") int orderId);
    int deleteAll(@Param("orderIds") List<Integer> items);
}
