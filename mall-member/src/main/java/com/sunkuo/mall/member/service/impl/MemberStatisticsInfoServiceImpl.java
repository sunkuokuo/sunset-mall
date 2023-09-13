package com.sunkuo.mall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.Query;
import com.sunkuo.mall.member.dao.MemberStatisticsInfoDao;
import com.sunkuo.mall.member.entity.MemberStatisticsInfoEntity;
import com.sunkuo.mall.member.service.MemberStatisticsInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * 会员统计信息
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
@Service
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoDao, MemberStatisticsInfoEntity> implements MemberStatisticsInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberStatisticsInfoEntity> page = this.page(
                new Query<MemberStatisticsInfoEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}