package com.sunkuo.mall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.Query;
import com.sunkuo.mall.member.dao.MemberLevelDao;
import com.sunkuo.mall.member.entity.MemberLevelEntity;
import com.sunkuo.mall.member.service.MemberLevelService;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * 会员等级
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
@Service
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelDao, MemberLevelEntity> implements MemberLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberLevelEntity> page = this.page(
                new Query<MemberLevelEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}