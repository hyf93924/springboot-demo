/**
 * create by HeYif.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.design.decorator;

/**
 * 抽象的装饰类
 *
 * @author heyif
 * @since v1.0 2019-01-09T16:38
 */
public class Decorate implements Component {

    //抽象组件类的引用
    private Component component;

    public Decorate(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        this.component.operation();
    }
}
