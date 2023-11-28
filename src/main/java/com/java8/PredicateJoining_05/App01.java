package com.java8.PredicateJoining_05;

import java.util.function.Predicate;

public class App01 {

    static boolean validate(Predicate<Integer> p, int num) {
        if (p.test(num)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 6, 8, 10, 12, 14, 16, 18, 20};

        // Predicate to check number are even or not
        Predicate<Integer> p1 = (num) -> num % 2 == 0;

        // Predicate to check number are greater than 10 or not
        Predicate<Integer> p2 = (num) -> num > 10;

        // print those numbers which are even and greater than 10
        for(int i : arr){
            if(validate(p1.and(p2),i)){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        // Predicate to check number are odd or not
        Predicate<Integer> p3 = (num) -> num % 2 != 0;

        // Predicate to check number are less than 10 or not
        Predicate<Integer> p4 = (num) -> num < 10;

        for (int i : arr) {
            if (validate(p3.and(p4), i)) {
                System.out.print(i + " ");
            }
        }
    }
}
