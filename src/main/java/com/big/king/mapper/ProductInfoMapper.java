package com.big.king.mapper;

import com.big.king.pojo.po.ProductInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: tenglong
 * @Date: 2020/2/25 21:23
 * @Description:商品的mapper类
 */

@Mapper
public interface ProductInfoMapper {


    /**
    * @Description 通过状态查询商品
    * @Author  yangtenglong
    * @Date   2020/2/25 21:33
    *
    */
    @Select("SELECT product_id,product_name,product_price,product_stock,product_description,product_icon,product_status,category_type FROM product_info WHERE product_status=#{product_status}")
    List<ProductInfo> findByProductStatus(@Param("product_status") Integer product_status);


    /**
     *  @author: yangtenglong
     *  @Date: 2020/3/22 23:09
     *  @Description: 通过ID查询某一条
     */
    @Select("SELECT product_id,product_name,product_price,product_stock,product_description,product_icon,product_status,category_type FROM `product_info` WHERE product_id =#{product_id}")
    ProductInfo findOne(@Param("product_id") Integer product_id);



    /**
    * @Description 新增商品
    * @Author  yangtenglong
    * @Date   2020/2/25 21:33
    *
    */

    @Insert("INSERT INTO product_info (product_name,product_price,product_stock,product_description,product_icon,product_status,category_type)"
            +"VALUES (#{product_name},#{product_price},#{product_stock},#{product_description},#{product_icon},#{product_status},#{category_type})")
    int addProductInfo(ProductInfo productInfo);

}
