package org.springlecture;

import org.springframework.stereotype.Component;

//4. create A class
@Component
public class A {

    private OrderService orderService;

    public A(OrderService orderService){
        this.orderService = orderService;
    }
}

