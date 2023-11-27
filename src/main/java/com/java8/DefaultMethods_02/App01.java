package com.java8.DefaultMethods_02;
/*
Default Methods:
---------------
>>> default methods are newely introduced in Java 8 and before that if any class implementing any interface then
    its compulsory to implement all the methods present in that interface
>>> main reason to add default methods in interface is to add new features if needed and to provide backward
    compatibility
>>> Default methods are those which you can't able to access directly using interface name
>>> To access default methods you need to implement them in class
*/

interface DefaultMethods{
    default void m1(){
        System.out.println("This is default methods");
    }
}
public class App01 implements DefaultMethods{
    public static void main(String[] args) {
        // Default methods are those which you can't able to access directly using interface name
        // DefaultMethods.m1();

        App01 app01 = new App01();
        app01.m1();
    }
}
