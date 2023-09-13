package com.sunkuo.mall.common.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页工具类
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023/9/13 15:26
 */
@Data
public class PageUtils implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 总记录数
     */
    private long totalCount;

    /**
     * 每页记录数
     */
    private long pageSize;

    /**
     * 总页数
     */
    private long totalPage;

    /**
     * 当前页数
     */
    private long currPage;

    /**
     * 列表数据
     */
    private List<?> list;

    /**
     * 分页
     *
     * @param page 分页数据
     */
    public PageUtils(IPage<?> page) {
        this.list = page.getRecords();
        this.totalCount = page.getTotal();
        this.pageSize = page.getSize();
        this.currPage = page.getCurrent();
        this.totalPage = (long) Math.ceil((double) totalCount / pageSize);
    }

}
