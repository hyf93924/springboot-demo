/**
 * create by HeYif.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.design.agent;

/**
 * RealSubject类
 * 实现抽象Subject
 *
 * @author heyif
 * @since v1.0 2019-01-16T14:36
 */
public class JavaEngineer implements Engineer {

    private String name;

    public JavaEngineer(String name) {
        this.name = name;
    }

    @Override
    public void coding() {
        System.out.println(name+" :正在努力的coding...");
        System.out.println(name+" :终于改完了!");
    }
}
