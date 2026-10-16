package org.springlecture;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springlecture.Payment.CardPayment;
import org.springlecture.Payment.PaymentService;

//23. created this class - for telling rules to context
//24.special class configuration - tell it by @Configuration
@Configuration
@ComponentScan  // 25.which classes spring needs to scan and manage its beans - @ComponentScan
//28. we can also pass the package name where only we want to search the component in - eg - @ComponentScan("org.springlecture") - by default the appconfig search in same folder it exists
public class AppConfig {

//    34. it gives message to ioc container -
//    35. it works searching in this package and also subpackages , we dont really need to pass package name

//    36. if i remove @Component from payment service - it wont make bean of it - and we get error as its bean is not created

//    37.as of now ioc container - is creating beans  and not - injecting dependencies - how it inject dependency


    //106 create your object and then ioc will manage it -  @Bean annotation
    @Bean //call these method you will get object store in ioc container
    public User createUser(){
        return new User("aditya",29);
    }


    /*108
    @Bean
    public PaymentService createCardPayment(){
        return new CardPayment();
    }*/


    /*109

    @Bean  //constructor through dependency
    public OrderService createOrderService(PaymentService paymentService){
        return new OrderService(paymentService);

    }



    //110.manually creating object but managed by ioc
     */


    /*111.
    @Bean  //feild through dependency
    public OrderService createOrderService(){

    //113. if pass autowire in setter -
        /*114.PaymentService payment = createCardPayment();
        OrderService order = new OrderService();
        order.setPaymentService(payment); //setter
        return order

     //115. return new OrderService();
     */
//112 managed dependency as well
    }



    //116. if bean of upi ,cash,card how to pass  - consturctor depenedncy - @Primary or qualifier


//117. priority to bean if bean and component  both used

//107. beans are creted and managed by - (component(class wide) or bean annotation(method wide or when creating object is complicated)  -we can also manage orderservice and cashpayement through bean component as well



//118. why appconfig when main is present - main is entry point and it will get heavy - we keep configuration in a different class


//119. Application context is super class 