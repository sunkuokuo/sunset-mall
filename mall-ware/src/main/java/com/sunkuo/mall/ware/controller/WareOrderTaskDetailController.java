package com.sunkuo.mall.ware.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.ware.entity.WareOrderTaskDetailEntity;
import com.sunkuo.mall.ware.service.WareOrderTaskDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 库存工作单
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 18:11:42
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("ware/wareOrderTaskDetail")
public class WareOrderTaskDetailController {
    private final WareOrderTaskDetailService wareOrderTaskDetailService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = wareOrderTaskDetailService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        WareOrderTaskDetailEntity wareOrderTaskDetail = wareOrderTaskDetailService.getById(id);
        return R.ok().put("wareOrderTaskDetail", wareOrderTaskDetail);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WareOrderTaskDetailEntity wareOrderTaskDetail) {
        wareOrderTaskDetailService.save(wareOrderTaskDetail);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WareOrderTaskDetailEntity wareOrderTaskDetail) {
        wareOrderTaskDetailService.updateById(wareOrderTaskDetail);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        wareOrderTaskDetailService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
