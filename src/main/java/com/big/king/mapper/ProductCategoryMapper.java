package com.big.king.mapper;

import com.big.king.pojo.po.ProductCategory;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 〈商品的mapper类〉<br>
 * @author king
 * @create 2020/02/08
 * @since 1.0.0
 */
@Mapper
public interface ProductCategoryMapper {

    @Select("SELECT category_id,category_name,category_type,create_time,update_time FROM product_category WHERE category_id=#{category_id}")
    ProductCategory queryProductCategoryOne(@Param("category_id") Integer category_id);

    @Select("SELECT category_id,category_name,category_type FROM product_category")
    List<ProductCategory> queryAllProductCategory();

   // @Update("INSERT INTO product_category(category_name,category_type) VALUES (#{category_name}, #{category_type})")

    @Insert("<script> INSERT INTO product_category "
            + "(category_name,category_type) "
            + "VALUES "
            + "<foreach collection = 'list' item='productCategory' separator=',' > "
            + " (#{productCategory.category_name},#{productCategory.category_type}) "
            + "</foreach>"
            + "</script>")
    int addProductCategory(@Param("list") List<ProductCategory> list);

}
