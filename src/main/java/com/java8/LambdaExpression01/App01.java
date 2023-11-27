package com.java8.LambdaExpression01;
/*
Functional Interface:
---------------------
>>> Functional Interface are those which contains only one abstract method
>>> Lambda expression can be used to represent the instance of a functional interface

Q. Why functional interface has only one abstract method:
---------------------------------------------------------
>>> lambda function can only provide the implementation for 1 method it is mandatory for the functional interface
to have ONLY one abstract method

Lambda Functions:
-------------------
Lambda function are those which are nameless and no need to pass type for arguments
*/
@FunctionalInterface
interface Left{
    public int nameLength(String name);
}

@FunctionalInterface
interface Right{
    public int add(int n1 , int n2);
}
public class App01 {
    public static void main(String[] args) {
        Left l = (name)-> {return name.length();};
        Right r = (num1,num2)-> {return num1+num2;};

        System.out.println(l.nameLength("shubham"));
        System.out.println(r.add(10,20));

    }
}
