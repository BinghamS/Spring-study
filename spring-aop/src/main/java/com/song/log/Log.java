package com.song.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/12 14:37
 */
public class Log implements MethodBeforeAdvice {
    //method：要执行的方法
    //object：参数
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+ method.getName()+"被执行了");
    }
}
