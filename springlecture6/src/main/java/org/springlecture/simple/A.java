package org.springlecture.simple;


//20.created A
public class A {


    /*24. created circular dependency
    private B b;
    public A(B b){
        this.b = b;
    }
    */


    //26. to resolve 25 comment code problem
    private B b;
    public A(){
        this.b = new B();
    }
}
