package com.java8.Streams_09.convertListToArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        Arrays.stream(arr).forEach(no-> System.out.println(no));


    }
}
