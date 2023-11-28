package com.java8.Streams_09.PerformOperationIntoArrayAndConvertBackToArray;

import java.util.Arrays;
import java.util.stream.Collectors;

public class App01 {
    public static void main(String[] args) {
        int[] ns = new int[] {1,2,3,4,5};

        int[] ms = Arrays.stream(ns).map(i -> i * 2).filter(i -> i % 2 == 0).toArray();
        System.out.println(Arrays.toString(ms));
    }
}
