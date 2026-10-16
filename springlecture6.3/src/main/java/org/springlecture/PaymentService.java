package org.springlecture;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService {

    public PaymentService(){
        System.out.println("payment service created");
    }

    public void pay(){
        System.out.println("paid");
    }
}
