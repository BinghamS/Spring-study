package com.song.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author songb
 * @date 2020/5/12 14:41
 */
public class AfterLog implements AfterReturningAdvice {

    //returnValue 返回值 o
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回结果为："+o);
    }
}