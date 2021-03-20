package com.whl.app.controller;

import com.whl.app.entity.Course;
import com.whl.app.mapper.TestMapper;
import com.whl.app.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public List<Course> hello() {
        return testService.getAllUsers();
//        return "Hello 薛开伦";
    }
}
