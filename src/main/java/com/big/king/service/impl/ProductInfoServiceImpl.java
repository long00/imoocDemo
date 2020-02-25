package com.big.king.service.impl;

import com.big.king.mapper.ProductInfoMapper;
import com.big.king.pojo.po.ProductInfo;
import com.big.king.service.ProductInfoService;
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
}
