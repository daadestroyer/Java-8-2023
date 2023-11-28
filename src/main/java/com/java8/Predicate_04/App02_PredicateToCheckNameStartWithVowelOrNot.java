package com.java8.Predicate_04;

import java.util.function.Predicate;

public class App02_PredicateToCheckNameStartWithVowelOrNot {
    public static void main(String[] args) {
        // Predicate used to check name start with any vowel or not
        Predicate<String> p1 = (name) -> {
            if (name.startsWith("A") || name.startsWith("a") || name.startsWith("E") || name.startsWith("e") || name.startsWith("I") || name.startsWith("i") || name.startsWith("O") || name.startsWith("o")
                    || name.startsWith("U") || name.startsWith("u")) {
                return true;
            } else {
                return false;
            }
        };
//        System.out.println(p1.test("shubham"));


        // way - 2
        String[] names = {"shubham","ansh","esha","ishan","orry","utkarsh","vatsal"};
        Predicate<String> p2 = (name)->{
            if (name.startsWith("A") || name.startsWith("a") || name.startsWith("E") || name.startsWith("e") || name.startsWith("I") || name.startsWith("i") || name.startsWith("O") || name.startsWith("o")
                    || name.startsWith("U") || name.startsWith("u")) {

                return true;
            } else {
                return false;
            }
        };
        for(String s : names){
            if(p2.test(s)){
                System.out.println(s);
            }
        }
    }
}
