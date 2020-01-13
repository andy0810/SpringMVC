package com.sun.springmvc.utils;

import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import com.alibaba.fastjson.JSON;
import java.nio.charset.Charset;


/**
 * @author ：sunzhongshu
 * @date ：Created in 2020/1/13 10:36
 * @description：自定义GenericFastJson2JsonRedisSerializer序列化器，其中用到了FastJsonWraper包装类
 * @modified By：
 */
public class GenericFastJson2JsonRedisSerializer{//<T> implements RedisSerializer<T> {
//    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
//    public GenericFastJson2JsonRedisSerializer() {
//        super();
//    }
//    @Override
//    public byte[] serialize(T t) throws SerializationException {
//        if (t == null){
//            return new byte[0];
//        }
//        FastJsonWraper<T> wraperSet = new FastJsonWraper<>(t);
//        return JSON.toJSONString(wraperSet, SerializerFeature.WriteClassName).getBytes(DEFAULT_CHARSET);
//    }
//
//    @Override
//    public T deserialize(byte[] bytes) throws SerializationException {
//        if (bytes == null || bytes.length <= 0){
//            return null;
//        }
//        String deserializeStr = new String(bytes,DEFAULT_CHARSET);
//        FastJsonWraper<T> wraperGet = JSON.parseObject(deserializeStr,FastJsonWraper.class);
//        return wraperGet.getValue();
//    }
//
//    @Override
//    public boolean canSerialize(Class<?> type) {
//        return false;
//    }
//
//    @Override
//    public Class<?> getTargetType() {
//        return null;
//    }
}
