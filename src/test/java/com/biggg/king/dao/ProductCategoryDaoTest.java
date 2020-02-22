package com.biggg.king.dao;

import com.biggg.king.pojo.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

/*    @Autowired
    private ProductCategoryDao productCategoryDao;

    private Logger logger = LoggerFactory.getLogger(ProductCategoryDaoTest.class);

    *//**
     * 查询功能
     *//*
    @Test
    public void findOneTest(){
        Optional<ProductCategory> productCategory = productCategoryDao.findById(1);
        logger.info("测试查询功能,{}",productCategory.toString());
    }

    *//**
     * 新增功能
     *//*
    @Test
    public void addTest(){
        ProductCategory productCategory = new ProductCategory();

        productCategory.setCategory_name("小马哥");
        productCategory.setCategory_type(444);
       // productCategoryDao.save(productCategory);
    }*/
}