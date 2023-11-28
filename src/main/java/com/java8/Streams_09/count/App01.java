package com.java8.Streams_09.count;

import java.util.Arrays;
import java.util.List;

public class App01 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ram", "laxman", "bharath", "shatrughan");
        long count = list.stream().filter((str) -> str.length() > 4).count();
        System.out.println(count);
    }
}
