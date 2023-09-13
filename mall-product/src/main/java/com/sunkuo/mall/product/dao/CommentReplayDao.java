package com.sunkuo.mall.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunkuo.mall.product.entity.CommentReplayEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:54
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
