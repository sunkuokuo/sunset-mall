package com.sunkuo.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.product.entity.AttrAttrGroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:54
 */
public interface AttrAttrGroupRelationService extends IService<AttrAttrGroupRelationEntity> {

    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return 分页查询结果
     */
    PageUtils queryPage(Map<String, Object> params);
}

