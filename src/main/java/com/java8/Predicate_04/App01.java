package com.java8.Predicate_04;

import java.util.function.Predicate;

/*
Predicate:
-----------
>>> Predicate is a Functional Interface that contains one abstract method called test
>>> Predicate is used to check some conditions and based on that it will return boolean value
>>> Predicate<TypeOfInputParameter> p = ()->{};
interface Predicate<T>{
    public boolean test(T t);
}
*/
public class App01 {
    public static void main(String[] args) {
        // A Predicate which is used to check length of string greater than 4 or not
        Predicate<String> p = (str) -> {
            return str.length() > 4;
        };
        System.out.println(p.test("shubham"));


    }
}
