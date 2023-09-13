package com.sunkuo.mall.common.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 常量
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023-09-13 15:06:38
 */
public class Constant {
    /**
     * 超级管理员ID
     */
    public static final int SUPER_ADMIN = 1;
    /**
     * 当前页码
     */
    public static final String PAGE = "page";
    /**
     * 每页显示记录数
     */
    public static final String LIMIT = "limit";
    /**
     * 排序字段
     */
    public static final String ORDER_FIELD = "sidx";
    /**
     * 排序方式
     */
    public static final String ORDER = "order";
    /**
     * 升序
     */
    public static final String ASC = "asc";

    /**
     * 菜单类型
     *
     * @author sunkuo
     * @email 1369926661@qq.com
     * @date 2023-09-13 15:06:38
     */
    @Getter
    @RequiredArgsConstructor
    public enum MenuType {
        /**
         * 目录
         */
        CATALOG(0),
        /**
         * 菜单
         */
        MENU(1),
        /**
         * 按钮
         */
        BUTTON(2);

        private final int value;
    }

    /**
     * 定时任务状态
     *
     * @author sunkuo
     * @email 1369926661@qq.com
     * @date 2023-09-13 15:06:38
     */
    @Getter
    @RequiredArgsConstructor
    public enum ScheduleStatus {
        /**
         * 正常
         */
        NORMAL(0),
        /**
         * 暂停
         */
        PAUSE(1);

        private final int value;

    }


}
