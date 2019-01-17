/**
 * create by HeYif.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.design.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author heyif
 * @since v1.0 2019-01-17T13:27
 */
public class HelloMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before："+method.getName());
        Object object = methodProxy.invokeSuper(o, objects);
        System.out.println("After："+method.getName());
        return object;
    }
}
