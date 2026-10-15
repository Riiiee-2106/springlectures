package org.springlecture.Notification;

//20.)made SmsNotification  class which implement interface notificationservice ,sendNotification method
public class SmsNotification implements NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("paid via SmsNotification");
    }
}
