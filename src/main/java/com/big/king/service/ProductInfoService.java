package com.big.king.service;

import com.big.king.pojo.po.ProductInfo;

import java.util.List;

/**
 * @Auther: tenglong
 * @Date: 2020/2/25 21:37
 * @Description:商品的service 接口类
 */
public interface ProductInfoService {


    /**
    * @Description 通过商品状态查询
    * @Author  yangtenglong
    * @Date   2020/2/25 21:38
    *
    */
    public List<ProductInfo> findByProductStatus(Integer product_status);

}
