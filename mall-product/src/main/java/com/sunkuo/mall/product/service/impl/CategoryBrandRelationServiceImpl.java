package com.sunkuo.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.Query;
import com.sunkuo.mall.product.dao.CategoryBrandRelationDao;
import com.sunkuo.mall.product.entity.CategoryBrandRelationEntity;
import com.sunkuo.mall.product.service.CategoryBrandRelationService;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * 品牌分类关联
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:54
 */
@Service
public class CategoryBrandRelationServiceImpl extends ServiceImpl<CategoryBrandRelationDao, CategoryBrandRelationEntity> implements CategoryBrandRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryBrandRelationEntity> page = this.page(
                new Query<CategoryBrandRelationEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}