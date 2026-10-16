package org.springlecture;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
   //1.bean initialization - understanding
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService orderService = context.getBean(OrderService.class);
//        System.out.println("payment service not started yet");
//        orderService.placeOrder();
//        PaymentService paymentService = context.getBean(PaymentService.class);

        A a = context.getBean(A.class);
        a.placeA();

    }
}