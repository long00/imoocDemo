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
    * @Description 新增商品
    * @Author  yangtenglong
    * @Date   2020/2/25 21:33
    *
    */

    @Insert("")
    int addProductInfo(ProductInfo productInfo);

}
