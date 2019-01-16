/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.singleton;

/**
 * 饿汉式单例模式
 * 非懒加载，线程安全
 *
 * @author heyif
 * @since v1.0 2019-01-09T15:25
 */
public class EagerSingleton {

    private static EagerSingleton INSTANCE = new EagerSingleton();

    public EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}
