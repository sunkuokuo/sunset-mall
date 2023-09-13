package com.sunkuo.mall.sale.api;

import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.sale.entity.CouponEntity;
import com.sunkuo.mall.sale.service.CouponService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author sunkuo
 * @date 2023/9/13 22:02
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sale/coupon")
public class CouponApi {
    private final CouponService couponService;

    @RequestMapping("/getCouponList")
    public R getCouponList() {
        List<CouponEntity> couponList = couponService.list();
        CouponEntity coupon = new CouponEntity();
        coupon.setCouponName("优惠券1");
        coupon.setAmount(new BigDecimal("100"));
        couponList.add(coupon);
        return R.ok().data(couponList);
    }
}
