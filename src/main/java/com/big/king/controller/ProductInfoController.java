package com.big.king.controller;

import com.big.king.pojo.po.ProductInfo;
import com.big.king.pojo.vo.request.ProductInfoVO;
import com.big.king.service.ProductInfoService;
import com.big.king.service.impl.ProductInfoServiceImpl;
import com.big.king.utils.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Auther: tenglong
 * @Date: 2020/2/25 21:44
 * @Description:
 */

@RequestMapping("/productInfo")
@RestController
public class ProductInfoController {

    private static Logger logger = LoggerFactory.getLogger(ProductCategoryController.class);

    @Autowired
    private ProductInfoService productInfoService = new ProductInfoServiceImpl();
    private ProductInfo productInfo;

    /**
    * @Description通过状态查询商品的信息
    * @Author  yangtenglong
    * @Date   2020/2/25 21:48
    *
    */
    @GetMapping("/product/{product_status}")
    public ResultData getProductInfoByStatus(@PathVariable("product_status") Integer product_status){


        try {
            logger.info("通过状态查询："+product_status);
            List<ProductInfo> productInfoList = productInfoService.findByProductStatus(product_status);
            return ResultData.SUCCESS(productInfoList);
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("系统通过商品状态，查询商品异常："+e);
        }
        return ResultData.ERROR("300","系统异常");
    }


    /**
    * @Description 新增商品信息
    * @Author  yangtenglong
    * @Date   2020/2/26 9:59
    *
    */
    @PostMapping("/products")
    public ResultData saveProductInfo(@RequestBody ProductInfoVO productInfoVO){

        try {
            logger.info("系统传入数据："+productInfoVO);

            return ResultData.SUCCESS("");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResultData.ERROR("300","系统异常");
    }

}

