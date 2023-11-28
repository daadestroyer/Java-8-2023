package com.java8.Streams_09.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App01_DoubleEveryNumberInList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 10, 20, 30, 40, 50);
        List<Integer> newList = list.stream().map((num) -> num * 2).collect(Collectors.toList());
        System.out.println(newList);
    }
}
