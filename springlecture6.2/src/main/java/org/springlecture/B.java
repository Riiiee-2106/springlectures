package org.springlecture;


import org.springframework.stereotype.Component;

//5. create B class
@Component
public class B {

    private OrderService orderService;

    public B(OrderService orderService){
        this.orderService = orderService;
    }

}

/*6. so getBean()
 or dependency though injector give same object of orderservice*/
