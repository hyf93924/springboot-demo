/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.adapter;

/**
 * 适配器类
 * 类适配器
 *
 * @author heyif
 * @since v1.0 2019-01-09T15:04
 */
public class Adapter2 extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
