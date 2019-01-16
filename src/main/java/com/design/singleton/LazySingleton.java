/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.singleton;

/**
 * 懒汉型单例模式
 * 懒加载，需加同步确保线程安全，不高效
 *
 * @author heyif
 * @since v1.0 2019-01-09T15:23
 */
public class LazySingleton {

    private static LazySingleton INSTANCE;

    public LazySingleton() {
    }

    public static synchronized LazySingleton getInstance(){
        if (INSTANCE==null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
