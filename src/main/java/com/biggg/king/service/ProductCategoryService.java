package com.biggg.king.service;

import com.biggg.king.pojo.ProductCategory;

import java.util.List;
 /**
  *  @author: yangtenglong
  *  @Date: 2020/2/19 9:32
  *  @Description:
  */
public interface ProductCategoryService {
    
    
    
    /**
    * @Description查询某一个
    * @Author  yangtenglong
    * @Date   2020/2/19 9:35
    * 
    */
    public ProductCategory findOne(String category_id);

    

    /**
    * @Description 查询所有的产品信息
    * @Author  yangtenglong
    * @Date   2020/2/19 9:34
    * 
    */
    List<ProductCategory> findAll();


    
    /**
    * @Description买家端，查询。
    * @Author  yangtenglong
    * @Date   2020/2/22 15:57
    * 
    */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    
    /**
    * @Description 保存方法
    * @Author  yangtenglong
    * @Date   2020/2/22 17:16
    * 
    */
     ProductCategory save(ProductCategory productCategory);
    
}
