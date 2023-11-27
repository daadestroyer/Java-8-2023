package com.java8.LambdaExpression01;


// older approach without using lambda expression
class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Run Implemented");
    }
}

public class App02 {
    public static void main(String[] args) {
        // older approach
        /*
        Runnable r = new MyThread();
        Thread t = new Thread(r);
        t.start();
        */

        // newer approach using lambda expression
        Runnable r = () -> {
            System.out.println("Run Implemented using Lambda Expression");
        };
    }
}
