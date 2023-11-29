package com.java8.Collections_10.comparator_03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Laptop {
    String name;
    int price;
    int ram;

    public Laptop(String name, int price, int ram) {
        this.name = name;
        this.price = price;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ram=" + ram +
                '}';
    }
}

public class App01 {
    public static void main(String[] args) {
        List<Laptop> list = Arrays.asList(new Laptop("Acer", 10000, 4), new Laptop("Apple", 20000, 16), new Laptop("Lenovo", 13000, 6));



        // implementing comparator using anonymous inner class
        Collections.sort(list, new Comparator<Laptop>() {
            public int compare(Laptop l1, Laptop l2) {
                return l1.ram > l2.ram ? 1 : -1;
            }
        });

        // using java 8 [sorting based on ram]
        List<Laptop> updatedLaptop1 = list.stream().sorted(Comparator.comparing(Laptop::getRam)).collect(Collectors.toList());
        updatedLaptop1.forEach(System.out::println);

        System.out.println();
        // using java 8 [sorted based on ram and price]
        List<Laptop> updatedLaptop2 = list.stream().sorted(Comparator.comparing(Laptop::getRam).thenComparing(Laptop::getName)).collect(Collectors.toList());
        updatedLaptop2.forEach(System.out::println);


    }
}
