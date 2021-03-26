package com.whl.app.mapper;

import com.whl.app.entity.Food;
import com.whl.app.entity.FoodClassification;
import com.whl.app.entity.FoodClassificationExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodClassificationMapper {
    List<FoodClassification> queryForList();

    long countByExample(FoodClassificationExample example);

    int deleteByExample(FoodClassificationExample example);

    int deleteByPrimaryKey(@Param("foodClassificationId") Integer foodClassificationId, @Param("foodClassificationName") String foodClassificationName, @Param("foodClassificationImg") String foodClassificationImg, @Param("priority") Integer priority, @Param("createTime") Date createTime);

    int insert(FoodClassification record);

    int insertSelective(FoodClassification record);

    List<FoodClassification> selectByExample(FoodClassificationExample example);

    int updateByExampleSelective(@Param("record") FoodClassification record, @Param("example") FoodClassificationExample example);

    int updateByExample(@Param("record") FoodClassification record, @Param("example") FoodClassificationExample example);
}