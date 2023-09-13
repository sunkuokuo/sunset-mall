package com.sunkuo.mall.order.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.order.entity.OrderSettingEntity;
import com.sunkuo.mall.order.service.OrderSettingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 订单配置信息
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 17:37:25
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("order/orderSetting" )
public class OrderSettingController {
    private final OrderSettingService orderSettingService;

    /**
     * 列表
     */
    @RequestMapping("/list" )
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = orderSettingService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        OrderSettingEntity orderSetting = orderSettingService.getById(id);
        return R.ok().put("orderSetting", orderSetting);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderSettingEntity orderSetting) {
        orderSettingService.save(orderSetting);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderSettingEntity orderSetting) {
        orderSettingService.updateById(orderSetting);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        orderSettingService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
