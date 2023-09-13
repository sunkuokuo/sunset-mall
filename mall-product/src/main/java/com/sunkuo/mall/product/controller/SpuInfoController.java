package com.sunkuo.mall.product.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.product.entity.SpuInfoEntity;
import com.sunkuo.mall.product.service.SpuInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * spu信息
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:53
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("product/spuInfo")
public class SpuInfoController {
    private final SpuInfoService spuInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = spuInfoService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        SpuInfoEntity spuInfo = spuInfoService.getById(id);
        return R.ok().put("spuInfo", spuInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SpuInfoEntity spuInfo) {
        spuInfoService.save(spuInfo);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SpuInfoEntity spuInfo) {
        spuInfoService.updateById(spuInfo);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        spuInfoService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
