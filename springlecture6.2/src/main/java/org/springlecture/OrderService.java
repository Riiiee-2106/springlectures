package org.springlecture;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//7. pass scope of orderservice
@Component
@Scope("singleton")  //8.can also pass prototype - get new object everytime
public class OrderService {

    public OrderService(){
        System.out.println("order service created");
    }

    public void placeOrder(){
        System.out.println("order placed");
    }

    //9.singleton design pattern - one java class should have one object (very strict)
//  10.  singleton in spring = one bean defn - one object
}
