package com.sunkuo.mall.common.utils;

import cn.hutool.http.HttpStatus;
import cn.hutool.json.JSONUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据
 *
 * @author sunkuo
 * @email 1369926661@qq.com
 * @date 2023/9/13 15:26
 */
public class R extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    /**
     * 获取data中指定类型的数据
     */
    public <T> T getData(String key, Class<T> clazz) {
        // 获取数据
        Object data = get(key);
        // 将数据序列化成JSON字符串格式
        String json = JSONUtil.toJsonStr(data);
        // 再通过JSON字符串将数据格式化成对应类型并返回
        return JSONUtil.toBean(json, clazz);
    }

    /**
     * 获取data中指定类型的数据
     */
    public <T> T getData(Class<T> clazz) {
        // 获取数据
        Object data = get("data");
        // 将数据序列化成JSON字符串格式
        String json = JSONUtil.toJsonStr(data);
        // 再通过JSON字符串将数据格式化成对应类型并返回
        return JSONUtil.toBean(json, clazz);
    }

    public R data(Object data) {
        put("data", data);
        return this;
    }

    public R() {
        put("code", 0);
        put("msg", "success");
    }

    public static R error() {
        return error(HttpStatus.HTTP_INTERNAL_ERROR, "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error(HttpStatus.HTTP_INTERNAL_ERROR, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public static R ok() {
        return new R();
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

}
