package com.sunkuo.mall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.Query;
import com.sunkuo.mall.product.dao.AttrAttrGroupRelationDao;
import com.sunkuo.mall.product.entity.AttrAttrGroupRelationEntity;
import com.sunkuo.mall.product.service.AttrAttrGroupRelationService;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * 属性&属性分组关联
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:54
 */
@Service
public class AttrAttrGroupRelationServiceImpl extends ServiceImpl<AttrAttrGroupRelationDao, AttrAttrGroupRelationEntity> implements AttrAttrGroupRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrAttrGroupRelationEntity> page = this.page(
                new Query<AttrAttrGroupRelationEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}