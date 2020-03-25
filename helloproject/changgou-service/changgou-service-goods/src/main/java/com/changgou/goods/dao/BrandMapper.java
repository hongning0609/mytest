package com.changgou.goods.dao;
import com.changgou.goods.pojo.Brand;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/****
 * @Author:传智播客
 * @Description:Brand的Dao
 * @Date 2019/6/14 0:12
 *****/
public interface BrandMapper extends Mapper<Brand> {

    /**
     * @author 栗子
     * @Description 通过分类id获取商品品牌列表
     * @Date 11:42 2020/2/21
      * @param categoryId
     * @return java.util.List<com.changgou.goods.pojo.Brand>
     **/
    @Select("SELECT tb.id, tb.`name` FROM tb_category_brand tcb ,tb_brand tb WHERE tcb.`category_id`  = #{categoryId} AND tb.id = tcb.`brand_id`")
    List<Brand> findBrandsByCategoryId(Integer categoryId);
}
