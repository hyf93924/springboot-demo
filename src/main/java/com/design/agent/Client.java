/**
 * create by HeYif.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.design.agent;

import java.lang.reflect.Proxy;

/**
 * 静态代理：
 * 例如客户有需求，产品经理（Proxy）先要整理需求，然后通知程序员（Subject）进行修改操作
 *
 * @author heyif
 * @since v1.0 2019-01-16T14:41
 */
public class Client {

    public static void main(String[] args) {
        /**
         * 静态代理
         */
        //实例一个Subject
//        JavaEngineer javaEngineer = new JavaEngineer("heyifeng");
//        //实例一个Proxy
//        ProductManager productManager = new ProductManager("yif",javaEngineer);
//
//        productManager.coding();

        /**
         * 动态代理
         */
        Engineer engineer = new JavaEngineer("heyifeng");
        //代理实例的代理程序
        ProxyHandler handler = new ProxyHandler(engineer, "yif");
        //返回指定接口的代理类实例，该接口可以将方法指派到指定的handler
        Engineer proxy = (Engineer) Proxy.newProxyInstance(Engineer.class.getClassLoader(), new Class[]{Engineer.class}, handler);
        proxy.coding();

        /**
         * 动态代理：
         * 1.通过实现InvocationHandler接口创建自己的调用处理器
         * 2.通过Proxy类指定ClassLoader对象和一组interface创建动态代理类
         * 3.通过反射机制获取动态代理类的构造函数，其参数类型是调用处理器接口类型
         * 4.通过构造函数创建代理类实例，此时需将调用处理器对象作为参数被传入
         */

    }
}
