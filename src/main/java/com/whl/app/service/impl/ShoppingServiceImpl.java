package com.whl.app.service.impl;

import com.whl.app.entity.Food;
import com.whl.app.entity.Shoppingcart;
import com.whl.app.entity.ShoppingcartExample;
import com.whl.app.mapper.FoodMapper;
import com.whl.app.mapper.ShoppingcartMapper;
import com.whl.app.service.FoodService;
import com.whl.app.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingServiceImpl implements ShoppingService {

    @Autowired
    ShoppingcartMapper shoppingcartMapper;

    public int insert (Shoppingcart shoppingcart){
        return shoppingcartMapper.insert(shoppingcart);
    }

    @Override
    public List<Shoppingcart> findAllByOpenId(String openId) {
        return shoppingcartMapper.selectByOpenId(openId);
    }

    @Override
    public int updateShoppingById(Shoppingcart shoppingcart) {
        return shoppingcartMapper.updateByPrimaryKeySelective(shoppingcart);
    }

    public int deleleShoppingById(Integer shoppingcartId) {
        return shoppingcartMapper.deleteByPrimaryKey(shoppingcartId);
    }

    @Override
    public int clearAll(String openId) {
        ShoppingcartExample shoppingcartExample = new ShoppingcartExample();
        ShoppingcartExample.Criteria criteria = shoppingcartExample.createCriteria();
        criteria.andOpenIdEqualTo(openId);
        return shoppingcartMapper.deleteByExample(shoppingcartExample);
    }
}
