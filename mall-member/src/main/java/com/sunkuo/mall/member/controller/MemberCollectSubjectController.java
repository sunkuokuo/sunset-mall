package com.sunkuo.mall.member.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.member.entity.MemberCollectSubjectEntity;
import com.sunkuo.mall.member.service.MemberCollectSubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 会员收藏的专题活动
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:04:40
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("member/memberCollectSubject")
public class MemberCollectSubjectController {
    private final MemberCollectSubjectService memberCollectSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = memberCollectSubjectService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        MemberCollectSubjectEntity memberCollectSubject = memberCollectSubjectService.getById(id);
        return R.ok().put("memberCollectSubject", memberCollectSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberCollectSubjectEntity memberCollectSubject) {
        memberCollectSubjectService.save(memberCollectSubject);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberCollectSubjectEntity memberCollectSubject) {
        memberCollectSubjectService.updateById(memberCollectSubject);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        memberCollectSubjectService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
