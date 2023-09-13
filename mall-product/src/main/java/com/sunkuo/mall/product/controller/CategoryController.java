package com.sunkuo.mall.product.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.product.entity.CategoryEntity;
import com.sunkuo.mall.product.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 商品三级分类
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:54
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("product/category")
public class CategoryController {
    private final CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = categoryService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId) {
        CategoryEntity category = categoryService.getById(catId);
        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category) {
        categoryService.save(category);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category) {
        categoryService.updateById(category);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds) {
        categoryService.removeByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
