/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ProductCategory
 * Author:   king
 * Date:     2020/02/08 19:18
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.biggg.king.pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 〈类目〉<br>
 * 〈〉
 *
 * @author king
 * @create 2020/02/08
 * @since 1.0.0
 */

@Entity   //表明这是一个实体类，要与数据库做orm映射，默认表的名字就是类名，表中的字段就是类中的属性。
@DynamicUpdate //动态修改updatetime
@Data
public class ProductCategory {

    @Id
    @GeneratedValue //为一个实体生成一个唯一标识的主键
    private Integer category_id;

    private String category_name;

    private Integer category_type;

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

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
        return "ProductCategory{" +
                "category_id=" + category_id +
                ", category_name='" + category_name + '\'' +
                ", category_type=" + category_type +
                '}';
    }

}
