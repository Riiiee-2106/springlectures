package org.springlecture;


import org.springlecture.Notification.EmailService;
import org.springlecture.Notification.NotificationService;

// 1.) made orderservice class
public class OrderService {
//    36.)now orderservice dont need to know wht kind of notification is being sent, it directly stores a kind of notification and call its sendNotification method
//37.) notification can be anything - (concrete) -
//    38.) now it is getting its dependency from main


//9.) orderservice class is dependent on emailservice,emailservice is dependency for orderservice
//    as until emailservice object is not made we cannot run orderservice code

//    10.) problem of tight coupled - orderservice make object of emailservice - its creating object of its own dependency
//    11.)orderservice can call any type of notification - sms,email,popup in loosely coupled
//    12.) in tightly coupled i need to come to orderservice class, and every time chance the object of my dependency - as smsNotification(),popupNotification()or EmailService ()
//        a) concrete class - emailService() object is passed
//        b) it is better to connect with interface rather than concrete classes


//    13.)another reason of tight coupling is - in which dependency orderservice got depenedent upon ,it created its object as well
//    24.) problem is where the object is being created - orderservice (business logic) can be passed, but we are creating object of our dependency  , we can call depenedencies method but not create object of it= fail  second solid principle  -- open close principle




//5.) make emailService object
//    14.)if i need to come here and change concrete class passed in object everytime - it breaks two solid principles - open close priniciple (dont modify ,just extend) - so use interface for loose coupling
    //21.) comment this - > EmailService notification = new EmailService();



//    22.)now we can make object of interface NotificationService and pass any kind of notification
    //28.) so instead of writing this -->  NotificationService notification = new EmailService();
//    25.) we are changing the passed class code everytime
//    26.) one service can depend on other class  ,but when there are 200-1000 classes present in java, they get very very much dependent on each other in major project (microservice break) - dependency are normal,but creating object your own dependency is not a business logic
//27.)we will try to keep this dependency object creation code somewhere else and just call its method when require - like in main class


//    29.) we will just call object of NotificationService  --> instance variable of interface
    private NotificationService notification;


//    30.) make orderservice constructor and pass instance variable as an dependency in it
//   39.) this is called dependency injection - from main to constructor,or from anywhere to constructor
    public OrderService(NotificationService notification){  //31.pass concrete object in constructor
        this.notification = notification;
//        35.) now both  - solid principal get fulfilled
    }


//    47.default consstructur
    OrderService(){

    }


    //44.) types of dependencies injection - through constructor - which we saw


//    45.) through setter
    public void setNotification(NotificationService notification){
        this.notification = notification;
    }

//    47.) field injector - will study later (it is possible when instance variables are not private but mostly they are private
//    48.)IOC = inversion of control (dependency and ioc used interchangibly but sligtly different)



//  2.) made placeOrder method()
    public void placeOrder(){
        System.out.println("order placed");
//        6.) call emailservice method
        notification.sendNotification();
//        23.) this time we get any type of notification we passed  object of -
    }
}


//40.)dependency injection benefits -
//a)better unit test -(we dont need to send actual object  ) ,if you want to test particular file we can pass fake notification as now orderservice gets its dependency from outside
//b)now if i want any other kind of notification we dont need to change it in orderservice