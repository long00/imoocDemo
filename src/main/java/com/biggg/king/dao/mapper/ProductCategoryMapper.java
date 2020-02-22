/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProductCategoryDao
 * Author:   king
 * Date:     2020/02/08 19:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.biggg.king.dao.mapper;

import com.biggg.king.pojo.ProductCategory;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author king
 * @create 2020/02/08
 * @since 1.0.0
 */
public interface ProductCategoryMapper {

    @Select("SELECT * FROM `product_category`")
    List<ProductCategory> queryProductCategoryList();

    @Update("INSERT INTO product_category(category_name,category_type) VALUES (#{category_name}, #{category_type})")
    int addProductCategory(ProductCategory productCategory);

}
