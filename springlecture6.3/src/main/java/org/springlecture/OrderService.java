package org.springlecture;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderService { //singleton - eager
    //if want can be lazy - @Lazy


    //make orderservice depenedent
     PaymentService paymentService;

    public OrderService(@Lazy PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("order service created");
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("place order");
    }
}
