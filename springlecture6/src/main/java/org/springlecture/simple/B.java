package org.springlecture.simple;



//22. trying to make circular dependency between A and B

//21.created B
public class B {

    /*23. created circular dependency
    private A a;
    public B(A a){
        this.a = a;
    }
     */


    //27. to resolve 25 comment code problem
    private A a;
    public B(){
        this.a = new A();
    }
}
