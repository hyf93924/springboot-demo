/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.observer;

/**
 * 观察者模式3
 *
 * @author heyif
 * @since v1.0 2019-01-09T13:54
 */
public class OctalObserver implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("OctalObserver: "+Integer.toOctalString(subject.getState()));
    }
}
