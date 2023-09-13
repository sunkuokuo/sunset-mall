package com.sunkuo.mall.order.dao;

import com.sunkuo.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 17:37:25
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
