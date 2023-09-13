package com.sunkuo.mall.member.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.member.entity.MemberReceiveAddressEntity;
import com.sunkuo.mall.member.service.MemberReceiveAddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员收货地址
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("member/memberReceiveAddress")
public class MemberReceiveAddressController {
    private final MemberReceiveAddressService memberReceiveAddressService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberReceiveAddressService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberReceiveAddressEntity memberReceiveAddress = memberReceiveAddressService.getById(id);
        return R.ok().put("memberReceiveAddress", memberReceiveAddress);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberReceiveAddressEntity memberReceiveAddress) {
        memberReceiveAddressService.save(memberReceiveAddress);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberReceiveAddressEntity memberReceiveAddress) {
        memberReceiveAddressService.updateById(memberReceiveAddress);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberReceiveAddressService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
