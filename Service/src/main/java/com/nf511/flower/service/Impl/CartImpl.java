package com.nf511.flower.service.Impl;

import com.nf511.flower.dao.CartDao;
import com.nf511.flower.entity.Cart;
import com.nf511.flower.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartImpl implements CartService {
    @Autowired
    CartDao cartDao;
    public List<Cart> selectAllCart(int userId) {
        return cartDao.selectAllCart(userId);
    }

    public Cart selectAllCartId(int cartId) {
        return cartDao.selectAllCartId(cartId);
    }

    public List<Cart> selectAllCartByPage(int pagelimit, int size) {
        return cartDao.selectAllCartByPage(pagelimit, size);
    }

    public int insertCart(Cart cart) {
        return cartDao.insertCart(cart);
    }

    public int updateCart(Cart cart) {
        return cartDao.updateCart(cart);
    }

    public int deleteCart(int cartId) {
        return cartDao.deleteCart(cartId);
    }

    public int deleteAll(List<Integer> items) {
        return cartDao.deleteAll(items);
    }
}
