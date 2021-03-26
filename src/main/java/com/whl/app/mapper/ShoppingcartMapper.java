package com.whl.app.mapper;

import com.whl.app.entity.Shoppingcart;
import com.whl.app.entity.ShoppingcartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingcartMapper {
    long countByExample(ShoppingcartExample example);

    int deleteByExample(ShoppingcartExample example);

    int deleteByPrimaryKey(Integer shppingcartId);

    int insert(Shoppingcart record);

    int insertSelective(Shoppingcart record);

    List<Shoppingcart> selectByExample(ShoppingcartExample example);

    Shoppingcart selectByPrimaryKey(Integer shppingcartId);

    int updateByExampleSelective(@Param("record") Shoppingcart record, @Param("example") ShoppingcartExample example);

    int updateByExample(@Param("record") Shoppingcart record, @Param("example") ShoppingcartExample example);

    int updateByPrimaryKeySelective(Shoppingcart record);

    int updateByPrimaryKey(Shoppingcart record);
}