package com.sunkuo.mall.member.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.member.entity.MemberLevelEntity;
import com.sunkuo.mall.member.service.MemberLevelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员等级
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("member/memberLevel")
public class MemberLevelController {
    private final MemberLevelService memberLevelService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberLevelService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberLevelEntity memberLevel = memberLevelService.getById(id);
        return R.ok().put("memberLevel", memberLevel);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberLevelEntity memberLevel) {
        memberLevelService.save(memberLevel);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberLevelEntity memberLevel) {
        memberLevelService.updateById(memberLevel);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberLevelService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
