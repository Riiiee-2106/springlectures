package org.springlecture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springlecture.Payment.PaymentService;

public class Main {
    public static void main(String[] args) {


//        5.created object of orderservice class
//        OrderService order = new OrderService();


//        6.called method of orderservice placeOrder
//        order.placeOrder();

//        12. make payementservice object here and then pass it in constructor of orderservice
      /*70 - comment =>  PaymentService paymentService = new PaymentService();
        OrderService order = new OrderService(paymentService);
        order.placeOrder();*/


//        13. now we dont want to manage beans of classes we want spring with help of ioc container to manage all these beans - right now main is doing all this work
//        14.if we want spring to manage these beans via ioc container - we need to add some dependency - > spring context (spring core dependency , which gives basic things like ioc container etc.., download it from mvn repo)


//        17. we use this reflection api a lot in spring - we store this in a class AppConfig

//        18. we need to tell spring which classes it need to manage - using @Component annotation =  manage its beans ( in orderservice and paymentservice as of now)


//        21. applicationcontext is an interface   whose objects cant be made  - this means start spring container using - annotation config application context simply - annotation based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); //22. we need to tell rules to it - in another class and pass its reflection in parameter of context (class - AppConfig)



/*      30. application context executes  -
1. ioc up
2.rules read from appconfig
3.component scan  - got orderservice and paymentservice
4.made its bean

 */


        //43. after @Autowired
     /*80- comment =>   OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();*/
        //    50.if orderservice didnt get a matching bean via construction injection - we can get null pointer exception
//  51.  if we didnt pass paymentservice as component  its bean will not get created, os bean gets created and want bean of ps - error - could not get bean of ps (no autowire candidate

//        52.what if multiple bean of payment service  - if one payement service(tight coupling) , but what if multiple payment service(loosely coupled) - interface concept


        //90.
        OrderService orderService = context.getBean(OrderService.class);
       orderService.placeOrder();

       //107.
        User user = context.getBean(User.class);
        user.getAge();


    }
}
        /*42. commented

//        33.these 31 and 32 point is executed when orderservice in independent and does not depend upon payment service object
//        31. lets try 30th point with orderservice bean calling - use reflection of orderservice class
         OrderService orderService = context.getBean(OrderService.class);
         orderService.placeOrder();

//         32.Paymentservice object
        //41.commenting this code - as we have used now autowired so it will be called with orderservice getbean
        PaymentService paymentService1 = context.getBean(PaymentService.class);
        paymentService1.pay();


    }
}
*/





/* 16. understanding reflection api


Student s = new Student();
s is a reference which point to student object -
we have special class in java - whose name is class

class - holds metadata

Class<Student> s1 = Student.class;
s1 is not object or reference variable of student - it is a reference which store student class metadata

it stores - class Name - student
feilds - name,age
constructor - student()
method - getAttendance(),print()
private member,public member etc..
annotations in class

it stores class metadata


class Student{
private String name;
private int age;

public Student(){

}

public void getAttendance(){


}

public void print(){


}
 */