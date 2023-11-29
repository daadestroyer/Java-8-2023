package com.java8.Streams_09.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);

        // perform natural sorting
        List<Integer> ascendingorder = list.stream().sorted().collect(Collectors.toList());
        System.out.println(ascendingorder);

        // perform reverse sorting
        // way - 1
        List<Integer> descendingOrder1 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(descendingOrder1);

        // way - 2
        List<Integer> descendingOrder2 = list.stream().sorted((no1, no2) -> no2.compareTo(no1)).collect(Collectors.toList());
        System.out.println(descendingOrder2);
    }
}
