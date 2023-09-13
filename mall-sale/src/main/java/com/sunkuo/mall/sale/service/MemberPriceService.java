package com.sunkuo.mall.sale.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.sale.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 17:52:32
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return 分页查询结果
     */
    PageUtils queryPage(Map<String, Object> params);
}

