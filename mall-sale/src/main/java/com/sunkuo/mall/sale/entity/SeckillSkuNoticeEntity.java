package com.sunkuo.mall.sale.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 秒杀商品通知订阅
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 17:52:32
 */
@Data
@TableName("sms_seckill_sku_notice")
public class SeckillSkuNoticeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * member_id
	 */
	private Long memberId;
	/**
	 * sku_id
	 */
	private Long skuId;
	/**
	 * 活动场次id
	 */
	private Long sessionId;
	/**
	 * 订阅时间
	 */
	private LocalDateTime subscribeTime;
	/**
	 * 发送时间
	 */
	private LocalDateTime sendTime;
	/**
	 * 通知方式[0-短信，1-邮件]
	 */
	private Integer noticeType;

}
