package com.java8.Streams_09.convertArrayToList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App01 {
    public static void main(String[] args) {
        int[] arr = {0,10,0,20,30,4};

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);

    }
}
