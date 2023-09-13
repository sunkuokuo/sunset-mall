package com.sunkuo.mall.ware.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.Query;
import com.sunkuo.mall.ware.dao.WareInfoDao;
import com.sunkuo.mall.ware.entity.WareInfoEntity;
import com.sunkuo.mall.ware.service.WareInfoService;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 * 仓库信息
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:11:42
 */
@Service
public class WareInfoServiceImpl extends ServiceImpl<WareInfoDao, WareInfoEntity> implements WareInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<WareInfoEntity> page = this.page(
                new Query<WareInfoEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

}