package com.sun.springmvc.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ：sunzhongshu
 * @date ：Created in 2020/1/13 10:39
 * @description：FastJsonWraper包装类
 * @modified By：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FastJsonWraper<T> {
    private T value;
}
