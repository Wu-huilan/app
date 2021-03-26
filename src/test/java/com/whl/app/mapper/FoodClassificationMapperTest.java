package com.whl.app.mapper;

import com.whl.app.entity.FoodClassification;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

public class FoodClassificationMapperTest {
    private SqlSessionFactory sqlSessionFactory=null;
    @Before
    public void init() throws Exception{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
//        System.out.println(sqlSessionFactory);
    }
    @Test
    public void queryForList() throws Exception{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        System.out.println(sqlSessionFactory);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        FoodClassificationMapper foodClassificationMapper = sqlSession.getMapper(FoodClassificationMapper.class);
        List<FoodClassification> list = foodClassificationMapper.queryForList();
        for (FoodClassification foodClassification : list) {
            System.out.println(foodClassification);
        }
    }
}
