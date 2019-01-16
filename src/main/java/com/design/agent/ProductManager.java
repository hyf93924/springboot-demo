/**
 * create by HeYif.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.design.agent;

/**
 * Proxy
 * 代理对象
 *
 * @author heyif
 * @since v1.0 2019-01-16T14:38
 */
public class ProductManager implements Engineer {

    private String name;
    private JavaEngineer javaEngineer;

    public ProductManager(String name, JavaEngineer javaEngineer) {
        this.name = name;
        this.javaEngineer = javaEngineer;
    }

    @Override
    public void coding() {
        arrange();                  //客户有需求
        javaEngineer.coding();      //代理给Subject
        appease();
    }

    //客户有需求
    private void arrange(){
        System.out.println(this.name+"：整理客户需求中...");
        System.out.println(this.name+"：输出需求文档，交给码农去完成!");
    }

    private void appease(){
        System.out.println(this.name+"：哎，需求变好多次了.得安抚一下这个码农才好!");
    }
}
