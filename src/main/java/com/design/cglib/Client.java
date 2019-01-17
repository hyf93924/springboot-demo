/**
 * create by HeYif.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.design.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * cglib动态代理
 *
 * @author heyif
 * @since v1.0 2019-01-17T13:30
 */
public class Client {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloService.class);  //继承被代理类
        enhancer.setCallback(new HelloMethodInterceptor());  //设置回调
        HelloService helloService = (HelloService) enhancer.create();  //生成代理对象
        helloService.sayHello();
    }
}
