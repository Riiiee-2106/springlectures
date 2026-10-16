package org.springlecture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //1 .understanding - bean scope


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        OrderService orderService = context.getBean(OrderService.class);

        //2. made another object of orderservice
        OrderService orderService2 = context.getBean(OrderService.class);

//      OrderService orderService3 = new OrderService();

////3.check if both orderservice objects are equal
//        System.out.println(orderService==orderService2);


    }
}