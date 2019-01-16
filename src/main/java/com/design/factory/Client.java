/**
 * 6006.com Inc.
 * Copyright (c) 2015-2019 All Rights Reserved.
 */
package com.design.factory;

/**
 * 客户端类
 *
 * @author heyif
 * @since v1.0 2019-01-09T14:27
 */
public class Client {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new AppleFactory();  //实例化具体工厂
        Phone phone = phoneFactory.createPhone();  //制造产品

        System.out.println(phone.brand());

        String fromPhoneNumber = "18758093443";
        String toPhoneNumber = "13170421169";
        phone.call(fromPhoneNumber, toPhoneNumber);

        System.out.println("-------------------------");

        phoneFactory = new HuaweiFactory();
        Phone huaweiPhone = phoneFactory.createPhone();

        System.out.println(huaweiPhone.brand());
        huaweiPhone.call(fromPhoneNumber, toPhoneNumber);

    }
}
