package com.nf511.flower.controller;


import com.nf511.flower.common.R;
import com.nf511.flower.entity.Cart;
import com.nf511.flower.entity.Order;
import com.nf511.flower.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    /**
     * 查询全部订单及订单商品信息
     * */
    @RequestMapping(path = "/selectAllOrder")
    @ResponseBody
    public R selectAllOrder(Order order){
        return R.ok(orderService.selectAllOrder(order));
    }

    /**
     * 查询全部订单信息
     * */
    @RequestMapping(path = "/selectAllOrderByPage")
    @ResponseBody
    public R selectAllOrderByPage(Order order){
        return R.ok(orderService.selectAllOrderPage(order));
    }

    /**
     * 查询全部订单数量
     * */
    @RequestMapping(path = "/getOrderCount")
    @ResponseBody
    public R getOrderCount(Order order){
        return R.ok(orderService.getOrderCount(order));
    }

    /**
     * 根据ID查询
     * */
    @RequestMapping(path = "/selectAllOrderId",method = RequestMethod.POST)
    @ResponseBody
    public R selectAllOrderId(int orderId){
        return R.ok(orderService.selectAllOrderId(orderId));
    }

    /**
     * 添加
     * */
    @RequestMapping(path = "/insertOrder",method = RequestMethod.POST)
    @ResponseBody
    public R insertOrder(Order order){
        return R.ok(orderService.insertOrder(order));
    }


    /**
     * 修改订单状态
     * */
    @RequestMapping(path = "/UpdateOrderState",method = RequestMethod.POST)
    @ResponseBody
    public R UpdateOrderState(int orderId, int orderState){
        return R.ok(orderService.UpdateOrderState(orderId,orderState));
    }






    /**
     * 修改
     * */
    @RequestMapping(path = "/updateCart",method = RequestMethod.POST)
    @ResponseBody
    public R updateOrder(Order order){
        return R.ok(orderService.updateOrder(order));
    }

    /**
     * 删除
     * */
    @RequestMapping(path = "/deleteOrder",method = RequestMethod.POST)
    @ResponseBody
    public R deleteOrder(int orderId){
        return R.ok(orderService.deleteOrder(orderId));
    }

    /**
     * 多删除
     * */
    @RequestMapping(path = "/deleteAll",method = RequestMethod.POST)
    @ResponseBody
    public R deleteAll(@RequestBody List<Integer> items){
        return R.ok(orderService.deleteAll(items));
    }


}
