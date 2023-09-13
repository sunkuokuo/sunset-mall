package com.sunkuo.mall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.Query;
import com.sunkuo.mall.ware.dao.PurchaseDao;
import com.sunkuo.mall.ware.entity.PurchaseEntity;
import com.sunkuo.mall.ware.service.PurchaseService;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * 采购信息
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:11:42
 */
@Service
public class PurchaseServiceImpl extends ServiceImpl<PurchaseDao, PurchaseEntity> implements PurchaseService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PurchaseEntity> page = this.page(
                new Query<PurchaseEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}