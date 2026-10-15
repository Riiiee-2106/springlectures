package com.springlectures.springlecture2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//2.annotation - restcontroller (will study later)- gateway to write endpoints like  /hello map to hello() method

@RestController
public class HelloController {
//    1.make class hellocontroller

//    2.make method say helloHome() map to endpoint /hello



//    3. call using annotation -GetMapping
//    4.either call it by yourself in main
    /*HelloController hello = new HelloController();
    String s = hello.helloHome();
    System.out.println(s)*/

    @GetMapping("hello")
    public String helloHome(){
        return "<h1>hello world<h1>";
    }

    @GetMapping("bye")
        public String sayBye(){
            return "bye!";
        }






}
