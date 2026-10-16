package org.springlecture;


import org.springframework.stereotype.Component;

@Component
public class C {

    A a;

    C(A a){
        this.a = a;
    }

public void placeC(){
    System.out.println("c placed");
}
}


