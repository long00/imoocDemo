package com.big.king.mapper;

import com.big.king.pojo.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {


    private Logger logger = LoggerFactory.getLogger(ProductCategoryMapperTest.class);

    private ProductCategoryMapper productCategoryMapper;

    /**
     * 查询商品表的所有数据
     */
    @Test
    public void queryProductCategories() {

        try {
            ProductCategory productCategoryList = productCategoryMapper.queryProductCategoryOne(1);
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