package com.sunkuo.mall.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.sale.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 17:52:32
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return 分页查询结果
     */
    PageUtils queryPage(Map<String, Object> params);
}

