package com.java8.Collections_10.intro_01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Comparable(I)
-------------
>>> Comparable is a Functional Interface which contains only one abstract method called compareTo() method
>>> public int compareTo(T o);
>>> Let's suppose we are comparing two numbers with this method
    10.compareTo(20) --> [give -1] means 10 need to come before 20
    20.compareTo(10) --> [give 1] means 20 need to come after 10
    10.compareTo(10) --> [give 0] means both the numbers are equal
>>> All Wrapper Classes [Byte,Short,Integer,Long,Float,Double,Boolean,Character], String, StringBuffer and
    StringBuilder by default implement comparable interface. Hence for this sort method simply will work
    to sort
*/
public class App01 implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1> o2){
            return -1;
        }
        else if(o1 < o2){
            return +1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        // Example of Comparable Interface
        List<Integer> list = Arrays.asList(10, 20, 3, 2, 7, 5, 6);

        // sorting in ascending order
        Collections.sort(list); // we are able to sort list of integers because integer class implements
                                // comparable interface

        System.out.println(list);

        // sorting in descending order
        // way - 1 by implementing Comparator interface
        Collections.sort(list,new App01());
        System.out.println("way - 1 "+list);

        // way - 2 by using anonymous inner class
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 > o2 ? -1 : o1 < o2 ? +1 : 0;
            }
        });
        System.out.println("way - 2 "+list);
        // way - 3 using lambda function
        Collections.sort(list,(no1,no2)->no2.compareTo(no1));
        System.out.println("way - 3 "+list);


    }


}
