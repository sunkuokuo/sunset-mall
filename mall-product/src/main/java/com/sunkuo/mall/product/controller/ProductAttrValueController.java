package com.sunkuo.mall.product.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.product.entity.ProductAttrValueEntity;
import com.sunkuo.mall.product.service.ProductAttrValueService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * spu属性值
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:54
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("product/productAttrValue")
public class ProductAttrValueController {
    private final ProductAttrValueService productAttrValueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = productAttrValueService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        ProductAttrValueEntity productAttrValue = productAttrValueService.getById(id);
        return R.ok().put("productAttrValue", productAttrValue);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ProductAttrValueEntity productAttrValue) {
        productAttrValueService.save(productAttrValue);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ProductAttrValueEntity productAttrValue) {
        productAttrValueService.updateById(productAttrValue);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        productAttrValueService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
