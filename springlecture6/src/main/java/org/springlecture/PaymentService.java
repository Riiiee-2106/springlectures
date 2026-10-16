package org.springlecture;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//7.create class
//8.apply annotation
@Component
public class PaymentService {

    //11.made method
    public void pay(){
        System.out.println("payment done!");
        //15.call orderservice method


        //41. we should call this method in orderservice method only
        /*42.comment it
        orderService.listOfItems();*/
    }


    //13. introucing circular dependency
    //14.creating instance variable of orderservice , constructor injection,
    @Autowired //34.field injection
    private OrderService orderService;
    //36. when circular dependency did not happen and we use field injection ,instance variable is private of payment service so how ioc store payment service object in paymentservice  without setter - using reflection (first create bean defn, private member injections can be done.


    //37.default constructor will be called now when field injection is required - so orderservice and payment service object gets created without an object , then does feild inejction


    /*38. spring ioc conatiner-
    1.create object service empty object
    2.create payment service empty obj
    3.inject paymentservice to orderservice
    4.inject orderservice to paymentservice


     */


    /*40.ioc work more like this-
    lets have class A -->orderservice ,B-->paymentservice
    1. create A -->a)bean defn and then create object partial
    2. inject its dependency --> still paymentservice not made
    3.Create B --> a)bean defn and then inject partial orderservice
    4.inject its depeedency
    5.make orderservice -> fully with paymentservice depenedency injected

    because of refernece object

    so why do we say , that circular dependency is a problem when it can be resolved by setter or field injection --> practically not a good coding practice - avoid circular dependency -  spring 2.6 version discourage circular dependency ,either you do setter,field or whatever injection -
    spring.main.allow-circular-reference :false
    if you want to allow make it true in spring 2.6 above versions
    otherwise in spring core is supported , but not in springboot


    we dont want to resolve circular dependency we should refactor our code - we should not have circular dependency in production level - as it created tight coupleness

    why a and b have responsibility entangled - we failed single responsibility principle = we dont want it to arise
     */



    //35.similarly through setter

    /*32.public PaymentService(OrderService orderService){
        this.orderService = orderService;
    }*/


}
