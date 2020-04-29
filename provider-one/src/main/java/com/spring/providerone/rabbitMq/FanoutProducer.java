package com.spring.providerone.rabbitMq;

import com.rabbitmq.client.BuiltinExchangeType;

public class FanoutProducer {

    private static final String EXCHANGE_NAME = "fanout.exchange";

    public void publishMsg(String routingKey, String msg) {
        try {
            MsgProducer.publishMsg(EXCHANGE_NAME, BuiltinExchangeType.FANOUT, routingKey, msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FanoutProducer directProducer = new FanoutProducer();
        String[] routingKey = new String[]{"aaa", "bbb"};
        String msg = "hello >>> ";


        for (int i = 0; i < 30; i++) {
            directProducer.publishMsg(routingKey[i % 2], msg + i);
        }
        System.out.println("----over-------");
    }

}
