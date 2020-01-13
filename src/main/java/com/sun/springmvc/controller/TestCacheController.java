package com.sun.springmvc.controller;

import com.sun.springmvc.cache.TestCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ：sunzhongshu
 * @date ：Created in 2020/1/13 11:31
 * @description：缓存测试Controller
 * @modified By：
 */
@RequestMapping("/cache")
@Controller
public class TestCacheController {

    @Autowired
    private TestCache testCache;

    @RequestMapping("saveCache")
    @ResponseBody
    public void saveCache(String name){
        testCache.save(name);
    }
    @RequestMapping("getCache")
    @ResponseBody
    public String getCache(String name){
        return testCache.getValue(name);
    }
}
