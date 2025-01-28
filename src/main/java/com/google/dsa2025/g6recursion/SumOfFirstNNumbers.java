package com.google.dsa2025.g6recursion;

public class SumOfFirstNNumbers {

    public static void main(String[] args) {
        parameterised(10, 0);
        System.out.println("from functional: " + functional(10));
    }

    public static void parameterised(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return;
        }
        parameterised(i-1, sum+i);
    }

    public static int functional(int n){
        if(n==0) {
            return 0;
        }
        return n + functional(n-1);
    }
}
