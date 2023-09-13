package com.sunkuo.mall.member.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.member.entity.MemberEntity;
import com.sunkuo.mall.member.feign.CouponFeignApi;
import com.sunkuo.mall.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * 会员
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("member/member")
public class MemberController {
    private final MemberService memberService;
    private final CouponFeignApi couponFeignApi;

    /**
     * 测试远程调用
     */
    @RequestMapping("/getMemberCouponList")
    public R getMemberCouponList() {
        MemberEntity member = new MemberEntity();
        member.setNickname("sunkuo");
        member.setMobile("1369926661");
        R couponList = couponFeignApi.getCouponList();
        Map<String, Object> map = new HashMap<>();
        map.put("member", member);
        map.put("couponList", couponList);
        return R.ok(map);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberEntity member = memberService.getById(id);
        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member) {
        memberService.save(member);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member) {
        memberService.updateById(member);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
