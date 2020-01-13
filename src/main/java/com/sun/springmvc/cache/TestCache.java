package com.sun.springmvc.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @author ：sunzhongshu
 * @date ：Created in 2020/1/13 11:27
 * @description：测试缓存
 * @modified By：
 */
@Component
public class TestCache {

    private static final String TEST_CACHE = "test:cache:";
    @Autowired
    private RedisTemplate redisTemplate;


    public void save(String value){
        redisTemplate.opsForValue().set(TEST_CACHE + value,value);
    }
    public String getValue(String key){
        return (String) redisTemplate.opsForValue().get(TEST_CACHE + key);
    }
}
