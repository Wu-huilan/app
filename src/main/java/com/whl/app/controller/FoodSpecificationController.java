package com.whl.app.controller;

import com.whl.app.entity.FoodClassification;
import com.whl.app.entity.FoodSpecification;
import com.whl.app.service.FoodClassificationService;
import com.whl.app.service.FoodSpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foodSpecification")
public class FoodSpecificationController {

    @Autowired
    private FoodSpecificationService foodSpecificationService;

    @RequestMapping("/getFoodSpecificationDetailsById")
    public List<FoodSpecification> getFoodSpecificationDetailsById(Integer foodId) {
        return foodSpecificationService.getFoodSpecificationDetailsById(foodId);
    }
}
