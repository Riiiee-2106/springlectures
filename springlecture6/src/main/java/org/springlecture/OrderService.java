package org.springlecture;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//6.create class
//9.apply annotation
@Component
public class OrderService {

    //10. create instnce variable , inject, and made method(call payment method pay)
   @Autowired //33. field injection
   private PaymentService paymentService;

   /*31. public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }*/

    public void OrderPlace(){
        paymentService.pay();
        System.out.println("placed order");
        //43. call listOfItem here
        listOfItems();
    }


    //16.made method passed in payment method
    public void listOfItems(){
        System.out.println("here is the menu");
    }


    //17.main-->order-->orderservice method - orderplace called ---> call payment pay method ---> call orderservice method listOfItem--->placed order (expected result)

    //18. will spring be able to create these beans ? constructor when called both calling each other object - no starting point , will not be able to created(beancureentlyincreationexception)--- unresolve circular reference

    //19. written code is not written clean - arise circular dependency


    //30.circular dependency between orderservice and paymentservice arise due to constructor injection , so instead using contructor go for field injection
}
