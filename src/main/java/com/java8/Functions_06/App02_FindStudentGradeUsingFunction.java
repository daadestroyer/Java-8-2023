package com.java8.Functions_06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

}

public class App02_FindStudentGradeUsingFunction {


    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("shubham", 90), new Student("ram", 80),
                new Student("shyam", 70), new Student("ghanshyam", 40));

        // Function to find each student grade
        Function<Student, String> f = (student) -> {
            int marks = student.marks;
            if (marks >= 90) {
                return "A";
            } else if (marks >= 80 && marks < 90) {
                return "B";
            } else if (marks >= 70 && marks < 80) {
                return "C";
            } else if (marks >= 60 && marks < 70) {
                return "D";
            } else {
                return "FAIL";
            }
        };

        for(Student s : students){
            System.out.println("Name:"+s.name);
            System.out.println("Grade:"+ f.apply(s));
            System.out.println("-------------");

        }
    }
}
