package com.sunkuo.mall.member.feign;

import com.sunkuo.mall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sunkuo
 * @date 2023/9/13 22:10
 */
@FeignClient("mall-sale")
public interface CouponFeignApi {
    @RequestMapping("/api/sale/coupon/getCouponList")
    R getCouponList();
}
