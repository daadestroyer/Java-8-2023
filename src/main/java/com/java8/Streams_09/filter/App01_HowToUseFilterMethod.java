package com.java8.Streams_09.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App01_HowToUseFilterMethod {
    public static void main(String[] args) {
        /*
		// without using Stream
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(0);
		al1.add(10);
		al1.add(20);
		al1.add(5);
		al1.add(15);
		al1.add(25);

		ArrayList<Integer> res1 = new ArrayList<Integer>();
		for(int i : al1) {
			if(i%2==0) {
				res1.add(i);
			}
		}
		System.out.println(res1);
		*/

        // using stream
        List<Integer> list = Arrays.asList(0, 10, 20, 30, 40, 55, 60, 77, 80, 89);
        List<Integer> evenlist = list.stream().filter((no) -> no % 2 == 0).collect(Collectors.toList());
        List<Integer> oddlist = list.stream().filter((no) -> no % 2 != 0).collect(Collectors.toList());

        System.out.println(evenlist);
        System.out.println(oddlist);

    }
}
