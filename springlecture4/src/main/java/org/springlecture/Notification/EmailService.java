package org.springlecture.Notification;

//18.)made emailservice class  which implement interface notificationservice ,sendNotification method
public class EmailService implements NotificationService{

@Override
    public void sendNotification(){
        System.out.println("paid via emailNotification");
    }
}
