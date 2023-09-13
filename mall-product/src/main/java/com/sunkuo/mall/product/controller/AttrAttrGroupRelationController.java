package com.sunkuo.mall.product.controller;

import com.sunkuo.mall.common.utils.PageUtils;
import com.sunkuo.mall.common.utils.R;
import com.sunkuo.mall.product.entity.AttrAttrGroupRelationEntity;
import com.sunkuo.mall.product.service.AttrAttrGroupRelationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * 属性&属性分组关联
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 16:35:54
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("product/attrAttrGroupRelation")
public class AttrAttrGroupRelationController {
    private final AttrAttrGroupRelationService attrAttrGroupRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = attrAttrGroupRelationService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        AttrAttrGroupRelationEntity attrAttrGroupRelation = attrAttrGroupRelationService.getById(id);
        return R.ok().put("attrAttrGroupRelation", attrAttrGroupRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AttrAttrGroupRelationEntity attrAttrGroupRelation) {
        attrAttrGroupRelationService.save(attrAttrGroupRelation);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AttrAttrGroupRelationEntity attrAttrGroupRelation) {
        attrAttrGroupRelationService.updateById(attrAttrGroupRelation);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        attrAttrGroupRelationService.removeByIds(Arrays.asList(ids));
        return R.ok();
    }

}
