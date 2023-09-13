package com.sunkuo.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 17:37:25
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    /**
     * 分页查询
     * @param params 查询参数
     * @return 分页查询结果
     */
    PageUtils queryPage(Map<String, Object> params);
}

