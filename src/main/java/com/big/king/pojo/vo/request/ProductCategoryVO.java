package com.big.king.pojo.vo.request;

import java.util.List;

/**
 * @Auther: tenglong
 * @Date: 2020/2/23 10:16
 * @Description:
 */
public class ProductCategoryVO {

    private List<ProductCategoryData> data;

    public List<ProductCategoryData> getData() {
        return data;
    }

    public void setData(List<ProductCategoryData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ProductCategoryVO{" +
                "data=" + data +
                '}';
    }
}
