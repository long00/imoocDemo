package com.big.king.service.impl;

import com.big.king.mapper.ProductInfoMapper;
import com.big.king.pojo.po.ProductInfo;
import com.big.king.pojo.vo.request.ProductInfoVO;
import com.big.king.service.ProductInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: tenglong
 * @Date: 2020/2/25 21:40
 * @Description:
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    ProductInfoMapper productInfoMapper;
    ProductInfo productInfo;

    private static Logger logger = LoggerFactory.getLogger(ProductInfoServiceImpl.class);


    /**
     * @param product_status
     * @Description 通过商品状态查询
     * @Author yangtenglong
     * @Date 2020/2/25 21:38
     */
    @Override
    public List<ProductInfo> findByProductStatus(Integer product_status) {

        return productInfoMapper.findByProductStatus(product_status);
    }


    /**
    * @Description 新增商品
    * @Author  yangtenglong
    * @Date   2020/3/2 18:01
    *
    */
    @Override
    public int addProductInfo(ProductInfoVO productInfoVO){

        ProductInfo productInfoPO = new ProductInfo();
        try {
            /*前一个为传入的数据，后一个为接收值的bean对象*/
            BeanUtils.copyProperties(productInfoVO,productInfoPO);
            return productInfoMapper.addProductInfo(productInfoPO);
        } catch (Exception e) {
            logger.info("新增商品异常："+e);
            return productInfoMapper.addProductInfo(productInfoPO);
        }

    }
}
