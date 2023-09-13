package com.sunkuo.mall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunkuo.mall.member.entity.MemberLoginLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {

}
