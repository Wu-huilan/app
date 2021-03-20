package com.whl.app.mapper;

import com.whl.app.entity.Course;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestMapper {
//    @Select("select * from user")
    List<Course> getAllUsers();
}
