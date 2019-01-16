/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.factory;

/**
 * 具体工厂类
 *
 * @author heyif
 * @since v1.0 2019-01-09T14:26
 */
public class HuaweiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        HuaweiPhone huaweiPhone = new HuaweiPhone();
        return huaweiPhone;
    }
}
