package com.spring.consumerfeign.rabbit;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.spring.consumerfeign.util.RabbitUtil;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class RabbitProvider {

    //定义队列
    static String QUEUE_NAME = "helloRabbit";

    public static void main(String[] args) {
        ConnectionFactory factory = RabbitUtil.getConnectionFactory();
        Connection connection=null;
        Channel channel=null;

        try{
            //1、创建连接和通道
            connection = factory.newConnection();
            channel = connection.createChannel();
            //2、为通道声明队列
            /*@param String queue 队列名
             *@param boolean durable 该队列是否需要持久化
             *@param boolean exclusive 该队列是否为该通道独占的（其他通道是否可以消费该队列）
             *@param boolean autoDelete 该队列不再使用的时候，是否让RabbitMQ服务器自动删除掉
             *@param Map<String, Object> arguments 其他参数
             */

            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            //3、发布消息
            String msg = " hello rabbitmq, welcome to sam's blog.";
            /*
             * @param String exchange 路由器（有的资料翻译成交换机）的名字,即将消息发到哪个路由器
             * @param String routingKey 路由键，即发布消息时，该消息的路由键是什么
             * @param BasicProperties props 指定消息的基本属性
             * @param byte[] body 消息体，也就是消息的内容，是字节数组
             */
            channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());
            System.out.println("provider send a msg: " + msg);
        }catch (IOException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } finally {
            //4、关闭连接
            if(channel!= null){
                try{
                    channel.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
