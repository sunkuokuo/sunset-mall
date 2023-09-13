package com.sunkuo.mall.member.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunkuo.mall.member.entity.IntegrationChangeHistoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {

}
