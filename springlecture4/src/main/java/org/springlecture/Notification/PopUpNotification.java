package org.springlecture.Notification;

//19.)made PopUpNotification  class  which implement interface notificationservice ,sendNotification method
public class PopUpNotification implements NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("paid via PopupNotification");
    }
}
