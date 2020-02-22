package com.biggg.king.controller;

import com.biggg.king.pojo.ProductCategory;
import com.biggg.king.service.ProductCategoryService;
import com.biggg.king.service.impl.ProductCategoryServiceImpl;
import com.biggg.king.utils.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


/**
 * 〈商品查询的controller类〉<br>
 * 〈〉
 *
 * @author king
 * @create 2020/02/08
 * @since 1.0.0
 */

@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {

    private static Logger logger = LoggerFactory.getLogger(ProductCategoryController.class);

    @Autowired
    private ProductCategoryService productCategoryService = new ProductCategoryServiceImpl();

    
    /**
    * @Description 查询某一条数据
    * @Author  yangtenglong
    * @Date   2020/2/22 17:49
    */
    @GetMapping("/category/{category_id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData findOne(@PathVariable("category_id") String category_id){

        try {
            logger.info("传递进来的商品ID:{}",category_id);
            ProductCategory productCategoryById = productCategoryService.findOne(category_id);
            return ResultData.SUCCESS(productCategoryById);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.ERROR("300","");
        }

    }
}
