package com.whl.app.controller;

import com.whl.app.entity.Food;
import com.whl.app.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping("/all")
    public List<Food> hello() {
        return foodService.getAllFood();
//        return "Hello 薛开伦";
    }
}
