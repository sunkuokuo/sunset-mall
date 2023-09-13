package com.sunkuo.mall.member.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.member.entity.MemberStatisticsInfoEntity;
import com.sunkuo.mall.member.service.MemberStatisticsInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员统计信息
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("member/memberStatisticsInfo")
public class MemberStatisticsInfoController {
    private final MemberStatisticsInfoService memberStatisticsInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberStatisticsInfoService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberStatisticsInfoEntity memberStatisticsInfo = memberStatisticsInfoService.getById(id);
        return R.ok().put("memberStatisticsInfo", memberStatisticsInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberStatisticsInfoEntity memberStatisticsInfo) {
        memberStatisticsInfoService.save(memberStatisticsInfo);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberStatisticsInfoEntity memberStatisticsInfo) {
        memberStatisticsInfoService.updateById(memberStatisticsInfo);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberStatisticsInfoService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
