package org.springlecture;

import org.springlecture.Notification.NotificationService;
import org.springlecture.Notification.PopUpNotification;

public class Main {
    public static void main(String[] args) {

//       7.) make orderservice object
        //32.)comment this ->OrderService order = new OrderService();


//        33.)make object of Interface and pass any type of notification
        NotificationService notification = new PopUpNotification();


//        34.) pass conrete class to the orderservice constructor
        OrderService order = new OrderService(notification);


//        8.) call orderservice method
        order.placeOrder();


//        46. dependency through setter
        order.setNotification(notification);


    }
}


//41.)if we make all dependencies in main - then main will get complicated - there may happen soo many wiring in main - this answer be given to us by spring core - as it will manage all these by itself


//42.) dependency -  says - dont create your own dependencies get your dependency's   - spring frame work will do allthis - dependencies inject,create and manage everything

//43.) a class should ask what it needs and not build everything itself




