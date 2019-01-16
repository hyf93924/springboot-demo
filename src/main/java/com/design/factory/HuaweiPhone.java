/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.factory;

/**
 * 具体产品类
 *
 * @author heyif
 * @since v1.0 2019-01-09T14:25
 */
public class HuaweiPhone implements Phone {
    @Override
    public String brand() {
        return "huawei";
    }

    @Override
    public void call(String from, String to) {
        System.out.println(String.format("华为手机正在拨打电话，本机号码为:%s,被叫号码为:%s",from,to));
    }
}
