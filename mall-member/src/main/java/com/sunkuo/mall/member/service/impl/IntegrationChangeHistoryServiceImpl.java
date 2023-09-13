package com.sunkuo.mall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.Query;
import com.sunkuo.mall.member.dao.IntegrationChangeHistoryDao;
import com.sunkuo.mall.member.entity.IntegrationChangeHistoryEntity;
import com.sunkuo.mall.member.service.IntegrationChangeHistoryService;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * 积分变化历史记录
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
@Service
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryDao, IntegrationChangeHistoryEntity> implements IntegrationChangeHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<IntegrationChangeHistoryEntity> page = this.page(
                new Query<IntegrationChangeHistoryEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}