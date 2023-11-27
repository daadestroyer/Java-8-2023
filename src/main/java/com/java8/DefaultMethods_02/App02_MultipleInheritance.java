package com.java8.DefaultMethods_02;


import com.java8.LambdaExpression01.App02;

interface Left{
    default void m1(String objName){
        System.out.println("m1 of left");
    }
}
interface Right{
    default void m1(String objName){
        System.out.println("m1 of right");
    }
}
public class App02_MultipleInheritance implements  Left,Right{
    public void m1(String objName ){
        if(objName.equals("left")){
            Left.super.m1("left");
        }
        else{
            Right.super.m1("right");
        }
    }

    public static void main(String[] args) {
        App02_MultipleInheritance app02MultipleInheritance = new App02_MultipleInheritance();
        app02MultipleInheritance.m1("left");
    }
}
