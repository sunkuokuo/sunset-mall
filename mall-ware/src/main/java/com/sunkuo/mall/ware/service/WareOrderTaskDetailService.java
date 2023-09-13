package com.sunkuo.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:11:42
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return 分页查询结果
     */
    PageUtils queryPage(Map<String, Object> params);
}

