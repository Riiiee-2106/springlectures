package org.springlecture.Payment;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//55.created class
//68.made this a component

//94.
@Qualifier
@Component
public class CardPayment implements  PaymentService { //59 implement interface paymentservice and its method {

    @Override
    public void pay() {
        System.out.println("paying via card");
    }

}