package com.java8.Functions_06;

import java.util.function.Function;

/*
Functions:
----------
>>> Function is a FunctionalInterface which takes input of type T and return output of type R which you can
    mention
>>> Function is a FunctionalInterface which contains one abstract method called apply
>>> public interface Function<T,R>{
        void apply(T t)
    }

*/
public class App01 {
    public static void main(String[] args) {
        Function<String,Integer> f1 = (name)-> {return name.length();};
        System.out.println(f1.apply("shubham"));


    }
}
