package com.java8.Collections_10.comparable_02;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Laptop implements Comparable<Laptop>{
    String name;
    int price;
    int ram;

    public Laptop(String name, int price, int ram) {
        this.name = name;
        this.price = price;
        this.ram = ram;
    }

    @Override
    public int compareTo(Laptop laptop) {
        return this.price > laptop.price ? 1 : -1;
//        return this.ram > laptop.ram ? -1 : 1;
    }
}
public class App01 {
    public static void main(String[] args) {
        List<Laptop> list = Arrays.asList(new Laptop("Acer", 10000, 4),
                new Laptop("Apple", 20000, 16),
                new Laptop("Lenovo", 13000, 6));

        //
        Collections.sort(list);
    }
}
