package com.nf511.flower.controller;


import com.nf511.flower.common.R;
import com.nf511.flower.entity.Cart;
import com.nf511.flower.entity.Orderflower;
import com.nf511.flower.service.OrderflowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/orderflowerService")
public class OrderflowerController {
    @Autowired
    OrderflowerService orderflowerService;
    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllOrderflower",method = RequestMethod.POST)
    @ResponseBody
    public List<Orderflower> selectAllOrderflower(){
        return orderflowerService.selectAllOrderflower();
    }

    /**
     * 根据ID查询
     * */
    @RequestMapping(path = "/selectAllOrderflowerId",method = RequestMethod.POST)
    @ResponseBody
    public R selectAllOrderflowerId(int orderflowerId){
        return R.ok(orderflowerService.selectAllOrderflowerId(orderflowerId));
    }

    /**
     * 添加
     * */
    @RequestMapping(path = "/insertOrderflower",method = RequestMethod.POST)
    @ResponseBody
    public R insertOrderflower(@RequestBody List<Integer> cartIds){
        return R.ok(orderflowerService.insertOrderflower(cartIds));
    }

    /**
     * 添加
     * */
    @RequestMapping(path = "/updateOrderflowerBycartId",method = RequestMethod.POST)
    @ResponseBody
    public R updateOrderflowerBycartId(@RequestBody int orderId,@RequestBody List<Integer> cartIds){
        return R.ok(orderflowerService.updateOrderflowerBycartId(orderId,cartIds));
    }

    /**
     * 修改
     * */
    @RequestMapping(path = "/updateOrderflower",method = RequestMethod.POST)
    @ResponseBody
    public R updateOrderflower(Orderflower orderflower){
        return R.ok(orderflowerService.updateOrderflower(orderflower));
    }

    /**
     * 删除
     * */
    @RequestMapping(path = "/deleteOrderflower",method = RequestMethod.POST)
    @ResponseBody
    public R deleteOrderflower(int orderflowerId){
        return R.ok(orderflowerService.deleteOrderflower(orderflowerId));
    }

    /**
     * 多删除
     * */
    @RequestMapping(path = "/deleteAll",method = RequestMethod.POST)
    @ResponseBody
    public R deleteAll(@RequestBody List<Integer> items){
        return R.ok(orderflowerService.deleteAll(items));
    }
}
