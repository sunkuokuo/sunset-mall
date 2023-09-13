package com.sunkuo.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    /**
     * 分页查询
     *
     * @param params 查询参数
     * @return 分页查询结果
     */
    PageUtils queryPage(Map<String, Object> params);
}

