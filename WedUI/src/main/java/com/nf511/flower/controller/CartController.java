package com.nf511.flower.controller;

import com.nf511.flower.common.R;
import com.nf511.flower.entity.Admin;
import com.nf511.flower.entity.Cart;
import com.nf511.flower.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/cart")
public class CartController {
    @Autowired
    CartService cartService;

    /**
     * 查询全部
     * */
    @RequestMapping(path = "/selectAllCart",method = RequestMethod.POST)
    @ResponseBody
    public List<Cart> selectAllCart(int userId){
        return cartService.selectAllCart(userId);
    }




    /**
     * 根据ID查询
     * */
    @RequestMapping(path = "/selectAllCartId",method = RequestMethod.POST)
    @ResponseBody
    public R selectAllCartId(int cartId){
        return R.ok(cartService.selectAllCartId(cartId));
    }

    /**
     * 添加
     * */
    @RequestMapping(path = "/insertCart",method = RequestMethod.POST)
    @ResponseBody
    public R insertCart(Cart cart){
        return R.ok(cartService.insertCart(cart));
    }

    /**
     * 修改
     * */
    @RequestMapping(path = "/updateCart",method = RequestMethod.POST)
    @ResponseBody
    public R updateCart(Cart cart){
        return R.ok(cartService.updateCart(cart));
    }

    /**
     * 删除
     * */
    @RequestMapping(path = "/deleteCart",method = RequestMethod.POST)
    @ResponseBody
    public R deleteCart(int cartId){
        return R.ok(cartService.deleteCart(cartId));
    }

    /**
     * 多删除
     * */
    @RequestMapping(path = "/deleteAll",method = RequestMethod.POST)
    @ResponseBody
    public R deleteAll(@RequestBody List<Integer> items){
        return R.ok(cartService.deleteAll(items));
    }

}
