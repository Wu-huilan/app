package com.whl.app.service;

import com.whl.app.entity.Course;
import com.whl.app.mapper.TestMapper;
import com.whl.app.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    public List<Course> getAllUsers(){
        return testMapper.getAllUsers();
    }
}
