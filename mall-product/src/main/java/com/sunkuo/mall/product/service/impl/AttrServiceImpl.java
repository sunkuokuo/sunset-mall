package com.sunkuo.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.Query;
import com.sunkuo.mall.product.dao.AttrDao;
import com.sunkuo.mall.product.entity.AttrEntity;
import com.sunkuo.mall.product.service.AttrService;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * 商品属性
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:54
 */
@Service
public class AttrServiceImpl extends ServiceImpl<AttrDao, AttrEntity> implements AttrService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrEntity> page = this.page(
                new Query<AttrEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}