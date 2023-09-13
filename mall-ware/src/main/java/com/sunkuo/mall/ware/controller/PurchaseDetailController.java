package com.sunkuo.mall.ware.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.ware.entity.PurchaseDetailEntity;
import com.sunkuo.mall.ware.service.PurchaseDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:11:42
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("ware/purchaseDetail")
public class PurchaseDetailController {
    private final PurchaseDetailService purchaseDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = purchaseDetailService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        PurchaseDetailEntity purchaseDetail = purchaseDetailService.getById(id);
        return R.ok().put("purchaseDetail", purchaseDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PurchaseDetailEntity purchaseDetail) {
        purchaseDetailService.save(purchaseDetail);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PurchaseDetailEntity purchaseDetail) {
        purchaseDetailService.updateById(purchaseDetail);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        purchaseDetailService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
