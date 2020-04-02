package com.big.king.service;

import com.big.king.pojo.po.ProductInfo;
import com.big.king.pojo.vo.request.ProductInfoVO;

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

    
    /**
    * @Description 新增商品信息
    * @Author  yangtenglong
    * @Date   2020/3/2 18:04
    * 
    */
    public int addProductInfo(ProductInfoVO productInfoVO);


    /**
     *  @author: yangtenglong
     *  @Date: 2020/4/2 18:13
     *  @Description:通过ID查询某个商品
     */
    public ProductInfo findByProductId(Integer product_id);
}
