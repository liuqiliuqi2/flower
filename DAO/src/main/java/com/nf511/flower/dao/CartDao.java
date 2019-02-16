package com.nf511.flower.dao;

import com.nf511.flower.entity.Cart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CartDao {
    List<Cart> selectAllCart();
    Cart selectAllCartId(@Param("cartId") int cartId);
    List<Cart>selectAllCartByPage(@Param("pagelimit") int pagelimit, @Param("size") int size);
    int insertCart(Cart cart);
    int updateCart(Cart cart);
    int deleteCart(@Param("cartId") int cartId);
    int deleteAll(@Param("cartIds") List<Integer> items);
}
