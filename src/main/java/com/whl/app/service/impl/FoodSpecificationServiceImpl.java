package com.whl.app.service.impl;

import com.whl.app.entity.FoodClassification;
import com.whl.app.entity.FoodSpecification;
import com.whl.app.mapper.FoodClassificationMapper;
import com.whl.app.mapper.FoodSpecificationMapper;
import com.whl.app.service.FoodClassificationService;
import com.whl.app.service.FoodService;
import com.whl.app.service.FoodSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodSpecificationServiceImpl implements FoodSpecificationService {

    @Autowired
    FoodSpecificationMapper foodSpecificationMapper;

    public List<FoodSpecification> getFoodSpecificationDetailsById(Integer foodSpecification){
        return foodSpecificationMapper.getFoodSpecificationDetailsById(foodSpecification);
    }
}
