package com.sunkuo.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.Query;
import com.sunkuo.mall.product.dao.SpuInfoDescDao;
import com.sunkuo.mall.product.entity.SpuInfoDescEntity;
import com.sunkuo.mall.product.service.SpuInfoDescService;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * spu信息介绍
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:53
 */
@Service
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescDao, SpuInfoDescEntity> implements SpuInfoDescService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuInfoDescEntity> page = this.page(
                new Query<SpuInfoDescEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}