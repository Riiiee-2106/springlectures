package org.springlecture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springlecture.simple.A;

public class Main {
    public static void main(String[] args) {
        //2.ioc container up
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        //12.make orderservice object and call orderservice method
        OrderService order = context.getBean(OrderService.class);
        order.OrderPlace();


        /*25.this will be wrong
        A a = new A(new B(new A));*/


/*39
        //28.
        A a = new A();  //29. constructor will keep on creating object of a and b , until stack is full ->stack overflow error

        */

    }
}