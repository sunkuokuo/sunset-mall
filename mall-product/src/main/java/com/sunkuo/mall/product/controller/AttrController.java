package com.sunkuo.mall.product.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.product.entity.AttrEntity;
import com.sunkuo.mall.product.service.AttrService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 商品属性
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:54
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("product/attr")
public class AttrController {
    private final AttrService attrService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = attrService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{attrId}")
    public R info(@PathVariable("attrId") Long attrId) {
        AttrEntity attr = attrService.getById(attrId);
        return R.ok().put("attr", attr);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AttrEntity attr) {
        attrService.save(attr);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AttrEntity attr) {
        attrService.updateById(attr);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] attrIds) {
        attrService.removeByIds(Arrays.asList(attrIds));
        return R.ok();
    }

}
