package com.java8.Supplier_08;

import java.util.function.Supplier;

/*
Supplier:
---------
>>> Supplier is a functional interface that returns result without taking any input
>>> Supplier is a functional interface that contains only abstract method called get
>>> interface Supplier<T>{
        T get(T t);
    }
*/
public class App01_ProgramToGenerateOTP {
    public static void main(String[] args) {
        // write a supplier to generate OTP of 6 digit
        Supplier<String> s = () -> {
            String OTP = "";
            for (int i = 0; i < 6; i++) {
                OTP += (int) (Math.random() * 10);
            }
            return OTP;
        };
        System.out.println("Your OTP = " + s.get());


        // supplier to generate random mobile number
        Supplier<String> s1 = () -> {
            String Mob = "+91-";
            for (int i = 1; i <= 10; i++) {
                Mob += (int) (Math.random() * 10);
            }
            return Mob;
        };
        System.out.println("Your Mob = "+s1.get());
    }
}
