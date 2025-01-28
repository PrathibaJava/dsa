package com.google.dsa2025.g6recursion;

import java.util.ArrayList;

public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fib(6));

        System.out.println(fibWithLoops(6));
    }

    public static int fib(int n) {
        if(n <= 1){
            return n;
        }
        return fib(n-1)+ fib(n-2);
    }

    public static int fibWithLoops(int n){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        al.add(1);

        for(int i=2; i<=n; i++){
            al.add(al.get(i-1)+al.get(i-2));
        }
        System.out.println(al);
        return al.get(n);
    }
}
