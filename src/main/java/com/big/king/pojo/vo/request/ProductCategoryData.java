package com.big.king.pojo.vo.request;

/**
 * @Auther: tenglong
 * @Date: 2020/2/23 11:00
 * @Description:
 */
public class ProductCategoryData {
    private String category_name;
    private Integer category_type;

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Integer getCategory_type() {
        return category_type;
    }

    public void setCategory_type(Integer category_type) {
        this.category_type = category_type;
    }

    @Override
    public String toString() {
        return "ProductCategoryVO{" +
                "category_name='" + category_name + '\'' +
                ", category_type=" + category_type +
                '}';
    }
}
