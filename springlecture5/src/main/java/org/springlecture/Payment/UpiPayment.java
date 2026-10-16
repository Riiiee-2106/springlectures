package org.springlecture.Payment;


//57. created class
public class UpiPayment implements PaymentService {//61 implement interface paymentservice and its method {


    @Override
    public void pay(){
        System.out.println("paying via upi");
    }
}
