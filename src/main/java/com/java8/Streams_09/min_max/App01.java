package com.java8.Streams_09.min_max;

import java.util.Arrays;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 3, 4, 5, 11, 43, 2);
        Integer min = list.stream().min((no1, no2) -> no1.compareTo(no2)).get();
        System.out.println(min);

        Integer max = list.stream().max((no1, no2) -> no1.compareTo(no2)).get();
        System.out.println(max);

    }
}
