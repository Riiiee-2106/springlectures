package org.springlecture;

public class User {
    //states of user
    private String name;
    private int age;


    //do you want this user class to be singleton - no we want multiple user
    //stateful classes -->should be prototype
    //stateless classes --> should be singleton (orderservice -handle order , no unique states)

//    other scopes - request(http req new, new obj),session(new user session , new obj),application(live application till then obj new) (later use in web application study later)


}
