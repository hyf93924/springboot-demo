/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.singleton;

/**
 * 静态内部类单例模式
 * 懒加载，线程安全
 *
 * @author heyif
 * @since v1.0 2019-01-09T15:47
 */
public class StaticNestedClassSingleton {

    private static class SingletonHolder{
        private static final StaticNestedClassSingleton INSTANCE = new StaticNestedClassSingleton();
    }

    public StaticNestedClassSingleton() {
    }

    public static StaticNestedClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
