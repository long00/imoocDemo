package com.big.king.controller;

import com.big.king.pojo.po.ProductCategory;
import com.big.king.pojo.vo.request.ProductCategoryVO;
import com.big.king.service.ProductCategoryService;
import com.big.king.service.impl.ProductCategoryServiceImpl;
import com.big.king.utils.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 〈类目 的controller类〉<br>
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
    private ProductCategory productCategory;


    /**
    * @Description 查询某一条数据
    * @Author  yangtenglong
    * @Date   2020/2/22 17:49
    */
    @GetMapping("/category/{category_id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData findOne(@PathVariable("category_id") Integer category_id){

        try {
            logger.info("传递进来的商品ID:{}",category_id);
            ProductCategory productCategoryById = productCategoryService.findOne(category_id);
            return ResultData.SUCCESS(productCategoryById);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.ERROR("300","");
        }

    }

    /**
    * @Description 查询所有信息
    * @Author  yangtenglong
    * @Date   2020/2/22 22:14
    *
    */
    @GetMapping("/categorys")
    public ResultData getAll(){

        try {
            logger.info("查询所有信息");
            List<ProductCategory> categoryList = productCategoryService.findAll();
            return ResultData.SUCCESS(categoryList);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.ERROR("300","系统异常");
        }

    }


    /**
    * @Description 新增商品
    * @Author  yangtenglong
    * @Date   2020/2/23 9:56
    *
    */
    @PostMapping("/category")
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData saveCategory(@RequestBody ProductCategoryVO productCategoryVO){
        try {
            logger.info("新增商品信息：{}"+productCategoryVO.getData());
            productCategoryService.save(productCategoryVO.getData());
            return ResultData.SUCCESS("");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultData.ERROR("","");
        }
    }
}
