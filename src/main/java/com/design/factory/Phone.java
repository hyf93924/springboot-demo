/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.factory;

/**
 * 抽象产品类
 *
 * @author heyif
 * @since v1.0 2019-01-09T14:21
 */
public interface Phone {
    String brand();
    void call(String from, String to);
}
