/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.observer;

/**
 * 观察者模式2
 *
 * @author heyif
 * @since v1.0 2019-01-09T13:52
 */
public class HexObserver implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("HexObserver: "+Integer.toHexString(subject.getState()));
    }
}
