package com.whl.app.mapper;

import com.whl.app.entity.FoodSpecification;
import com.whl.app.entity.FoodSpecificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodSpecificationMapper {
    List<FoodSpecification> getFoodSpecificationDetailsById(Integer foodId);

    long countByExample(FoodSpecificationExample example);

    int deleteByExample(FoodSpecificationExample example);

    int deleteByPrimaryKey(Integer foodSpecificationId);

    int insert(FoodSpecification record);

    int insertSelective(FoodSpecification record);

    List<FoodSpecification> selectByExample(FoodSpecificationExample example);

    FoodSpecification selectByPrimaryKey(Integer foodSpecificationId);

    int updateByExampleSelective(@Param("record") FoodSpecification record, @Param("example") FoodSpecificationExample example);

    int updateByExample(@Param("record") FoodSpecification record, @Param("example") FoodSpecificationExample example);

    int updateByPrimaryKeySelective(FoodSpecification record);

    int updateByPrimaryKey(FoodSpecification record);
}