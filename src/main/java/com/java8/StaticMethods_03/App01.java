package com.java8.StaticMethods_03;

/*
Static Methods:
---------------
>>> Static methods can be used to create utility classes that contain general-purpose methods
>>> The interface static methods are similar to static methods of class
>>> Overriding of interface static method is not allowed
>>> Child classes can use interface static method just by using interface reference name only
*/

interface StaticMethods{
    static void m1(){
        System.out.println("static method m1");
    }
    default  void m2(){
        System.out.println("default methods m2");
    }
}
public class App01 implements StaticMethods{
    public static void main(String[] args) {
        StaticMethods.m1();
        new App01().m2();
    }
}
