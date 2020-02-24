package com.big.king.service.impl;

import com.big.king.mapper.ProductCategoryMapper;
import com.big.king.pojo.po.ProductCategory;
import com.big.king.pojo.vo.request.ProductCategoryData;
import com.big.king.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈商品的实现类>
 * @author king
 * @create 2020/02/08
 * @since 1.0.0
 */

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {


    @Autowired
    ProductCategoryMapper productCategoryMapper;
    private ProductCategory productCategory;

    /**
     * @param category_id
     * @Description查询某一个
     * @Author yangtenglong
     * @Date 2020/2/19 9:35
     */
    @Override
    public ProductCategory findOne(Integer category_id) {

        return productCategoryMapper.queryProductCategoryOne(category_id);
    }

    /**
     * @Description 查询所有的产品信息
     * @Author yangtenglong
     * @Date 2020/2/19 9:34
     */
    @Override
    public List<ProductCategory> findAll() {

        return productCategoryMapper.queryAllProductCategory();
    }

    /**
     * @param categoryTypeList
     * @Description买家端，查询。
     * @Author yangtenglong
     * @Date 2020/2/22 15:57
     */
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return null;
    }

    /**
     * @param productCategory
     * @Description 保存方法
     * @Author yangtenglong
     * @Date 2020/2/22 17:16
     */
    @Override
    public ProductCategory save(List<ProductCategoryData> productCategory) {

        ProductCategory productCategoryPO = null;
        List<ProductCategory> productCategoryList = new ArrayList<>();
        for (ProductCategoryData productCategoryData : productCategory ) {
            productCategoryPO = new ProductCategory();
            productCategoryPO.setCategory_name(productCategoryData.getCategory_name());
            productCategoryPO.setCategory_type(productCategoryData.getCategory_type());
            productCategoryList.add(productCategoryPO);
        }

        productCategoryMapper.addProductCategory(productCategoryList);
        return null;
    }

}
