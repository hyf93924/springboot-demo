/**
 * create by HeYif.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.design.decorator;

/**
 * 具体装饰类
 *
 * @author heyif
 * @since v1.0 2019-01-09T16:41
 */
public class ConcreteDecorate extends Decorate {
    public ConcreteDecorate(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }

    /**
     * 装饰类为组件类增加的行为方法
     */
    private void addBehavior(){
        System.out.println("ConcreteDecorate's added behavior");
    }
}
