package com.whl.app.service;

import com.whl.app.entity.Food;
import com.whl.app.entity.Shoppingcart;

import java.util.List;


public interface ShoppingService {
    int insert (Shoppingcart shoppingcart);

    List<Shoppingcart> findAllByOpenId(String openId);

    int updateShoppingById(Shoppingcart shoppingcart);

    int deleleShoppingById(Integer shoppingcartId);

    int clearAll(String openId);
}
