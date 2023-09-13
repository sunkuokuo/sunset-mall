package com.sunkuo.mall.member.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.Query;
import com.sunkuo.mall.member.dao.MemberCollectSpuDao;
import com.sunkuo.mall.member.entity.MemberCollectSpuEntity;
import com.sunkuo.mall.member.service.MemberCollectSpuService;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * 会员收藏的商品
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
@Service
public class MemberCollectSpuServiceImpl extends ServiceImpl<MemberCollectSpuDao, MemberCollectSpuEntity> implements MemberCollectSpuService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberCollectSpuEntity> page = this.page(
                new Query<MemberCollectSpuEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}