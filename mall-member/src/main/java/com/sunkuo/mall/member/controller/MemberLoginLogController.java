package com.sunkuo.mall.member.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.member.entity.MemberLoginLogEntity;
import com.sunkuo.mall.member.service.MemberLoginLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员登录记录
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("member/memberLoginLog")
public class MemberLoginLogController {
    private final MemberLoginLogService memberLoginLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberLoginLogService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberLoginLogEntity memberLoginLog = memberLoginLogService.getById(id);
        return R.ok().put("memberLoginLog", memberLoginLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberLoginLogEntity memberLoginLog) {
        memberLoginLogService.save(memberLoginLog);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberLoginLogEntity memberLoginLog) {
        memberLoginLogService.updateById(memberLoginLog);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberLoginLogService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
