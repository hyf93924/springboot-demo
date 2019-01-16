/**
 * create by HeYif.
 * Copyright (c) 2019 All Rights Reserved.
 */
package com.rabbitmq.topics;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 主题路由
 *
 * @author heyif
 * @since v1.0 2019-01-14T15:51
 */
public class TopicsSend {

    private static final String EXCHANGE_NAME="topics_logs";

    private static final String[] routingKeys = new String[]{"*.orange.*","*.*.rabbit","lazy.#"};

    public static void main(String[] args) throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.exchangeDeclare(EXCHANGE_NAME, "topic");

        for (String routingKey : routingKeys){
            String message = "Topics Send the message level:" + routingKey;
            channel.basicPublish(EXCHANGE_NAME, routingKey, null, message.getBytes());
            System.out.println("Topics Send"+routingKey +"':'" + message);
        }

        channel.close();
        connection.close();
    }
}
