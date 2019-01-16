/**
 * 6006.com Inc.
 * Copyright (c) 2015-2018 All Rights Reserved.
 */
package com.rabbitmq.routing;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 生产者
 * 路由
 *
 * @author heyif
 * @since v1.0 2018-12-24T13:36
 */
public class RoutingSendDirect {
    private static final String EXCHANGE_NAME = "direct_logs";
    //定义路由
    private static final String[] routingKeys = new String[]{"info", "warn", "error"};

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        //声明交换机
        //direct：消息会传递到bindingkey与消息携带的routingKey完全匹配的队列
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");

        for(String routingKey : routingKeys){
            String message = "RoutingSendDirect Send the message level:" + routingKey;
            channel.basicPublish(EXCHANGE_NAME, routingKey, null, message.getBytes());
            System.out.println("RoutingSendDirect Send"+routingKey +"':'" + message);
        }

        channel.close();
        connection.close();
    }
}
