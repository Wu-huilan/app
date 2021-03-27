package com.whl.app.mapper;

import com.whl.app.entity.FoodClassification;
import com.whl.app.entity.Shoppingcart;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;

public class ShoppingMapperTest {
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
        ShoppingcartMapper shoppingcartMapper = sqlSession.getMapper(ShoppingcartMapper.class);
        Shoppingcart shoppingcart = new Shoppingcart();
        shoppingcart.setFoodId(1);
        shoppingcart.setCount(1);
        shoppingcart.setFoodspecificationids("1,2");
        shoppingcart.setOpenId("openId");
        System.out.println(shoppingcartMapper.insert(shoppingcart));
        sqlSession.commit();
    }

    @Test
    public void findAllByOpenId() throws Exception{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        System.out.println(sqlSessionFactory);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ShoppingcartMapper shoppingcartMapper = sqlSession.getMapper(ShoppingcartMapper.class);
        List<Shoppingcart> list = shoppingcartMapper.selectByOpenId("oDoDm5BivWWIz0obEVlgAKulx8u4");
        for (Shoppingcart shoppingcart : list) {
            System.out.println(shoppingcart);
        }
    }

    @Test
    public void updateShopping() throws Exception{
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        System.out.println(sqlSessionFactory);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        ShoppingcartMapper shoppingcartMapper = sqlSession.getMapper(ShoppingcartMapper.class);
        Shoppingcart shoppingcart = new Shoppingcart();
        shoppingcart.setShppingcartId(8);
        shoppingcart.setCount(24);
        int i = shoppingcartMapper.updateByPrimaryKeySelective(shoppingcart);
        System.out.println(i);
    }
}
