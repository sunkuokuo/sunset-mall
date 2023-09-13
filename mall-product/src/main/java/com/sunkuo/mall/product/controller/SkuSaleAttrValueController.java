package com.sunkuo.mall.product.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.product.entity.SkuSaleAttrValueEntity;
import com.sunkuo.mall.product.service.SkuSaleAttrValueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * sku销售属性&值
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:54
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("product/skuSaleAttrValue")
public class SkuSaleAttrValueController {
    private final SkuSaleAttrValueService skuSaleAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = skuSaleAttrValueService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SkuSaleAttrValueEntity skuSaleAttrValue = skuSaleAttrValueService.getById(id);
        return R.ok().put("skuSaleAttrValue", skuSaleAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SkuSaleAttrValueEntity skuSaleAttrValue) {
        skuSaleAttrValueService.save(skuSaleAttrValue);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SkuSaleAttrValueEntity skuSaleAttrValue) {
        skuSaleAttrValueService.updateById(skuSaleAttrValue);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        skuSaleAttrValueService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
