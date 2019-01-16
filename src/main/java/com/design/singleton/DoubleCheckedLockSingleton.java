/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.singleton;

/**
 * 双重加锁单例模式
 * 懒加载，线程安全
 *
 * @author heyif
 * @since v1.0 2019-01-09T15:26
 */
public class DoubleCheckedLockSingleton {

    private static volatile DoubleCheckedLockSingleton INSTANCE;

    public DoubleCheckedLockSingleton() {
    }

    public static DoubleCheckedLockSingleton getInstance(){
        if (INSTANCE==null){
            synchronized (DoubleCheckedLockSingleton.class){
                if (INSTANCE==null){
                    INSTANCE=new DoubleCheckedLockSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
