/**
 * create by HeYif.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.design.decorator;

/**
 * 具体组件类
 *
 * @author heyif
 * @since v1.0 2019-01-09T16:40
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent's operation!");
    }
}
