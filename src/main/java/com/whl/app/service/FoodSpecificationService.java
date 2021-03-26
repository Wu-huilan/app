package com.whl.app.service;

import com.whl.app.entity.FoodClassification;
import com.whl.app.entity.FoodSpecification;

import java.util.List;


public interface FoodSpecificationService {
    List<FoodSpecification> getFoodSpecificationDetailsById(Integer foodSpecification);
}
