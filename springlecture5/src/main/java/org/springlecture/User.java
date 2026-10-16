package org.springlecture;


/*problem where component cant be used -
//102. we cant make it Component - how to create its object as constructor logic is complicated - what is name,age?
//103no value given of primitives

//104 third party library - have .class file - we can not write in these code - read only files


//105for these we use Appconfig
 */

//100. created this class
public class User {


    //101. created variable,constructor,setter and getters

    private String name;
    private int age;


    public User(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
