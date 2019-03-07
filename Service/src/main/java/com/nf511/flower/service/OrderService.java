package com.nf511.flower.service;


import com.nf511.flower.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderService {
    int insertOrder(Order order);
    Order selectAllOrderId(@Param("orderId") int orderId);
    List<Order> selectAllOrder(Order order);
    int getOrderCount(Order order);
    List<Order> selectAllOrderPage(Order order);
    int UpdateOrderState(@Param("orderId") long orderId, @Param("orderState") long orderState);





    List<Order>selectAllOrderByPage(@Param("pagelimit") int pagelimit, @Param("size") int size);
    int updateOrder(Order order);
    int deleteOrder(@Param("orderId") int orderId);
    int deleteAll(@Param("orderIds") List<Integer> items);
    int insertOrderByOrderId(Order order);

}
