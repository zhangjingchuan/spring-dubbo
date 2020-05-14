package com.youxuewen.dubbo.consumer;

import com.youxuewen.dubbo.ServerApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * created by zhangjingchuan on 2020/5/14
 */
public class ConsumerClient {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");

        context.start();

        while (true){
            Scanner scanner = new Scanner(System.in);

            String message = scanner.next();

            ServerApi serverApi = (ServerApi)context.getBean("consumerService"); // 获取远程服务代理
            String hello = serverApi.sendMessage(message);
            System.out.println( hello ); // 显示调用结果
        }


    }
}
