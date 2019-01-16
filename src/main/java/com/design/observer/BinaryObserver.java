/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.observer;

/**
 * 观察者实现类1
 *
 * @author heyif
 * @since v1.0 2019-01-09T13:51
 */
public class BinaryObserver implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("BinaryObserver: "+Integer.toBinaryString(subject.getState()));
    }
}
