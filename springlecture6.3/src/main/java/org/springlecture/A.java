package org.springlecture;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


//no circular dependency
@Component
public class A {
    C c;

    A(@Lazy C c){
        this.c = c;
        System.out.println("A created");

    }

    public void placeA(){
        c.placeC();
    }
}
