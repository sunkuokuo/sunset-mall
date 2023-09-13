package com.sunkuo.mall.ware.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.ware.entity.WareOrderTaskEntity;
import com.sunkuo.mall.ware.service.WareOrderTaskService;
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
@RequestMapping("ware/wareOrderTask")
public class WareOrderTaskController {
    private final WareOrderTaskService wareOrderTaskService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = wareOrderTaskService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        WareOrderTaskEntity wareOrderTask = wareOrderTaskService.getById(id);
        return R.ok().put("wareOrderTask", wareOrderTask);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WareOrderTaskEntity wareOrderTask) {
        wareOrderTaskService.save(wareOrderTask);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WareOrderTaskEntity wareOrderTask) {
        wareOrderTaskService.updateById(wareOrderTask);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        wareOrderTaskService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
