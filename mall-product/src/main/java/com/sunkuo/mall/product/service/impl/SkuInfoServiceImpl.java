package com.sunkuo.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.Query;
import com.sunkuo.mall.product.dao.SkuInfoDao;
import com.sunkuo.mall.product.entity.SkuInfoEntity;
import com.sunkuo.mall.product.service.SkuInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * sku信息
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:54
 */
@Service
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfoEntity> implements SkuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SkuInfoEntity> page = this.page(
                new Query<SkuInfoEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}