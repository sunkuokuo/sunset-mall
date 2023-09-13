package com.sunkuo.mall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunkuo.mall.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:54
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
