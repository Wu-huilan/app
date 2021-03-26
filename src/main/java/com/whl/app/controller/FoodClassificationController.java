package com.whl.app.controller;

import com.whl.app.entity.FoodClassification;
import com.whl.app.service.FoodClassificationService;
import com.whl.app.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/foodClassification")
public class FoodClassificationController {

    @Autowired
    private FoodClassificationService foodClassificationService;

    @RequestMapping("/all")
    public List<FoodClassification> hello() {
        return foodClassificationService.getAllFoodClassification();
//        return "Hello 薛开伦";
    }
}
