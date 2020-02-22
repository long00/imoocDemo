package com.biggg.king.dao.mapper;

import com.biggg.king.pojo.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {


    private Logger logger = LoggerFactory.getLogger(ProductCategoryMapperTest.class);

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    /**
     * 查询商品表的所有数据
     */
    @Test
    public void queryProductCategories() {

        try {
            List<ProductCategory> productCategoryList = productCategoryMapper.queryProductCategoryList();
            logger.info("mybatis 查询测试：" + productCategoryList.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addProductCategorie() {

        try {
            ProductCategory productCategory = new ProductCategory();
            productCategory.setCategory_name("大强子");
            productCategory.setCategory_type(25);
            productCategoryMapper.addProductCategory(productCategory);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}