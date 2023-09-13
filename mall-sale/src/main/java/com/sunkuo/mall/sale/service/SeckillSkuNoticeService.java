package com.sunkuo.mall.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.sale.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 17:52:32
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return 分页查询结果
     */
    PageUtils queryPage(Map<String, Object> params);
}

