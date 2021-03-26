package com.whl.app.mapper;

import com.whl.app.entity.FoodSpecificationDetail;
import com.whl.app.entity.FoodSpecificationDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodSpecificationDetailMapper {
    long countByExample(FoodSpecificationDetailExample example);

    int deleteByExample(FoodSpecificationDetailExample example);

    int deleteByPrimaryKey(Integer foodSpecificationDetailId);

    int insert(FoodSpecificationDetail record);

    int insertSelective(FoodSpecificationDetail record);

    List<FoodSpecificationDetail> selectByExample(FoodSpecificationDetailExample example);

    FoodSpecificationDetail selectByPrimaryKey(Integer foodSpecificationDetailId);

    int updateByExampleSelective(@Param("record") FoodSpecificationDetail record, @Param("example") FoodSpecificationDetailExample example);

    int updateByExample(@Param("record") FoodSpecificationDetail record, @Param("example") FoodSpecificationDetailExample example);

    int updateByPrimaryKeySelective(FoodSpecificationDetail record);

    int updateByPrimaryKey(FoodSpecificationDetail record);
}