package com.whl.app.service.impl;

import com.whl.app.entity.Food;
import com.whl.app.mapper.FoodMapper;
import com.whl.app.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodMapper foodMapper;

    public List<Food> getAllFood(){
        return foodMapper.selectByExample(null);
    }
}
