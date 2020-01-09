package com.sun.springmvc.context;

import org.springframework.stereotype.Component;

/**
 * @author ：sunzhongshu
 * @date ：Created in 2020/1/9 14:37
 * @description：ThreadLocal的使用
 * @modified By：
 */
@Component
public class SessionContext<T> {
    public static final String SESSION_INFO = "SessionInfo";

    private ThreadLocal<T> holder = new ThreadLocal<>();

    public T get() {
        return holder.get();
    }

    public void set(T session) {
       holder.set(session);
    }

    public void clear(){
        holder.remove();
    }
}
