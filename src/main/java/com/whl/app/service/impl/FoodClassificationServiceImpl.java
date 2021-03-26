package com.whl.app.service.impl;

import com.whl.app.entity.Food;
import com.whl.app.entity.FoodClassification;
import com.whl.app.mapper.FoodClassificationMapper;
import com.whl.app.mapper.FoodMapper;
import com.whl.app.service.FoodClassificationService;
import com.whl.app.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodClassificationServiceImpl implements FoodClassificationService {

    @Autowired
    FoodClassificationMapper foodClassificationMapper;

    public List<FoodClassification> getAllFoodClassification(){
        return foodClassificationMapper.queryForList();
    }
}
