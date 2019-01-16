/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标类：
 * 主题，被观察对象
 * 1.attach：订阅主题
 * 2.detach：取消订阅
 * 3.notifyObservers：主题状态有更新，通知订阅者
 *
 * @author heyif
 * @since v1.0 2019-01-09T13:44
 */
public class Subject {

    //订阅者集合
    private List<Observer> observers = new ArrayList<>();
    //主题状态
    private int state;

    //订阅
    public void attach(Observer observer){
        if (observer!=null){
            observers.add(observer);
        }
    }
    //取消订阅
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //主题更新
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(this);
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
