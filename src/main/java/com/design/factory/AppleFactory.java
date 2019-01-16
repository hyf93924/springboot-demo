/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.factory;

/**
 * @author heyif
 * @since v1.0 2019-01-09T14:24
 */
public class AppleFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        ApplePhone applePhone = new ApplePhone();
        return applePhone;
    }
}
