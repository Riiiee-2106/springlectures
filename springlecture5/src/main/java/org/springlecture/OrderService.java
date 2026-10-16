package org.springlecture;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springlecture.Payment.PaymentService;

//1. created orderservice
@Component //19. manage its bean - @Component   //26.the classes which have this component scan and manage its bean
public class OrderService {


//    7.instance variable of paymentservice
    //46. make this instance variable feild injection  - via Autowired
    //47.commented =
//48. @Autowired
   //63. comment - >private PaymentService paymentService;

//    9.either i can make paymentservice object here in orderservice as -
//   10. private PaymentService paymentService = new PaymentService();  --> but this is hardcoded in orderservice class (it breaks  single responsibility principle - we want to provide paymentservice object through somewhere else to orderservice class)


//    11.so we can provide paymentservice object to orderservice class through constructor
//    38. now as of now we have created instance variable and injected payment service through constructor  - but how spring is wiring dependency  - we does it via another annotation @Autowired
//    40.so first it makes object of paymentservice and then when in making of orderservice it passes paymentservice object as an injector
//49 .testing does not need real paymentservice object dependency
//64. comment - >@Autowired //39.this can be placed in another places as well
  /* 65 = comment public OrderService (PaymentService paymentService){
        this.paymentService = paymentService;
    }*/



    /*45. commented
    //44. lets say when construcctor injection is not happening - we do it with setter
@Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
*/




//29.lets say right now - orderservice is independent and does not depend on paymentservice object
//    so comment this -  private PaymentService paymentService ;
//    and stop constructor injection



//    2.make function placeorder
   /*66 comment public void placeOrder(){

//        8. method call of paymentservice using its instance variable
        paymentService.pay();


        System.out.println("order placed");
    }*/



    //67. made interface paymentservice instance variable and injected via constructor
    private PaymentService paymentService;


    public OrderService(@Qualifier("casPay")PaymentService paymentService){
        //99.("cashPayment") PaymentService paymentService)
        // {//98. pass changed qualifier name here
        // 95. here pass in constructor the bean you want to inject via Qualifier and name of bean

        //96. where  ever you are injecting the dependency via - constructor , setter etc you pass qualifier there
        this.paymentService = paymentService;
    }



    public void placeOrder(){
        paymentService.pay();
        System.out.println("order placed");
    }
}
