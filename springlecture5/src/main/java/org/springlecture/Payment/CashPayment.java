package org.springlecture.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//56.created class
//91. made this component - now two component cash and cardpayment - now which dependency will be injected - for this we use another annotation @Primary or @Qualifier

//92.make it primary

//93. we can also make these two bean @Qualifier
@Qualifier("casPay") //97. we can also change qualifier name
@Primary
@Component
public class CashPayment implements  PaymentService {  //60 implement interface paymentservice and its method {

    @Override
    public void pay() {
        System.out.println("paying via cash");
    }
}