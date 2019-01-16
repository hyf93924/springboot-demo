/**
 * create by HeYif.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.design.decorator;

/**
 * 客户端类
 *
 * @author heyif
 * @since v1.0 2019-01-09T16:42
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreteDecorate concreteDecorate = new ConcreteDecorate(component);
        concreteDecorate.operation();
    }
}
