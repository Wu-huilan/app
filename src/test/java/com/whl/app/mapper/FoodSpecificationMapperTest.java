package com.whl.app.mapper;

import com.whl.app.entity.FoodClassification;
import com.whl.app.entity.FoodSpecification;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

public class FoodSpecificationMapperTest {
    private SqlSessionFactory sqlSessionFactory=null;
    @Before
    public void init() throws Exception{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
    }
    @Test
    public void getFoodSpecificationDetailsById() throws Exception{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        System.out.println(sqlSessionFactory);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        FoodSpecificationMapper foodClassificationMapper = sqlSession.getMapper(FoodSpecificationMapper.class);
        List<FoodSpecification> foodSpecification = foodClassificationMapper.getFoodSpecificationDetailsById(1);
        for (FoodSpecification specification : foodSpecification) {
            System.out.println(specification);
        }

    }
}
