/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.observer;

/**
 * 客户端类
 *
 * @author heyif
 * @since v1.0 2019-01-09T13:55
 */
public class Client {

    public static void main(String[] args) {

        Subject subject = new Subject();

        HexObserver hexObserver = new HexObserver();
        OctalObserver octalObserver = new OctalObserver();
        BinaryObserver binaryObserver = new BinaryObserver();

        //观察者订阅主题
        subject.attach(hexObserver);
        subject.attach(octalObserver);
        subject.attach(binaryObserver);

        System.out.println("Set state:15");
        subject.setState(15);  //设置状态
        subject.notifyObservers();  //状态改变，通知

        System.out.println("-----------------");
        //取消订阅主题
        subject.detach(octalObserver);
        System.out.println("Set state:24");
        subject.setState(24);  //改变状态
        subject.notifyObservers();  //状态改变，通知
    }
}
