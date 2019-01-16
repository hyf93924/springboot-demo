/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.adapter;

/**
 * 客户端类
 *
 * @author heyif
 * @since v1.0 2019-01-09T15:05
 */
public class Client {
    public static void main(String[] args) {
        //实例化是陪着
        Adaptee adaptee = new Adaptee();
        //目标: 将适配者当参数传入
        Target target = new Adapter(adaptee);
        target.request();
    }
}
