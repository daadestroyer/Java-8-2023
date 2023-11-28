package com.java8.Streams_09.sum;

import java.util.Arrays;

public class App01 {
    public static void main(String[] args) {
        int[] ns = new int[] {1,2,3,4,5};

        int sum = Arrays.stream(ns).sum();
        System.out.println(sum);
    }
}
