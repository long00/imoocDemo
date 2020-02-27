package com.big.king.pojo.vo.request;

import java.math.BigDecimal;

/**
 * @Auther: tenglong
 * @Date: 2020/2/26 10:35
 * @Description:
 */
public class ProductInfoVO {

    private String product_name; //商品名称
    private BigDecimal product_price;//单价
    private Integer product_stock;//库存
    private String product_description;//描述
    private String product_icon; //小图
    private Integer product_status; //商品状态,0正常1下架
    private Integer category_type; //类目编号

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public BigDecimal getProduct_price() {
        return product_price;
    }

    public void setProduct_price(BigDecimal product_price) {
        this.product_price = product_price;
    }

    public Integer getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(Integer product_stock) {
        this.product_stock = product_stock;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public String getProduct_icon() {
        return product_icon;
    }

    public void setProduct_icon(String product_icon) {
        this.product_icon = product_icon;
    }

    public Integer getProduct_status() {
        return product_status;
    }

    public void setProduct_status(Integer product_status) {
        this.product_status = product_status;
    }

    public Integer getCategory_type() {
        return category_type;
    }

    public void setCategory_type(Integer category_type) {
        this.category_type = category_type;
    }

    @Override
    public String toString() {
        return "ProductInfoVO{" +
                "product_name='" + product_name + '\'' +
                ", product_price=" + product_price +
                ", product_stock=" + product_stock +
                ", product_description='" + product_description + '\'' +
                ", product_icon='" + product_icon + '\'' +
                ", product_status=" + product_status +
                ", category_type=" + category_type +
                '}';
    }
}
