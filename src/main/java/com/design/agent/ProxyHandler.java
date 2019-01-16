/**
 * create by HeYif.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.design.agent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk动态代理
 *
 * @author heyif
 * @since v1.0 2019-01-16T14:51
 */
public class ProxyHandler implements InvocationHandler {

    private Object target;
    private String name;

    public ProxyHandler(Object target, String name) {
        this.target = target;
        this.name = name;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        arrange();
        method.invoke(target, args);
        appease();
        return null;
    }

    //客户有需求
    private void arrange(){
        System.out.println(this.name+"：整理客户需求中...");
        System.out.println(this.name+"：输出需求文档，交给码农去完成!");
    }

    private void appease(){
        System.out.println(this.name+"：哎，需求变好多次了.得安抚一下这个码农才好!");
    }
}
