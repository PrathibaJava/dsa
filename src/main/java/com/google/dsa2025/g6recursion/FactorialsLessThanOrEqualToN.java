package com.google.dsa2025.g6recursion;

import java.util.ArrayList;

public class FactorialsLessThanOrEqualToN {

    public static void main(String[] args) {
        System.out.println(factorialNumbers(3));

        printFactorials(20, 1, 1);
    }

    public static void printFactorials(int n, int i, int factorial){
        if(factorial >= n){
            return;
        }
        System.out.println(factorial);
        printFactorials(n, ++i, factorial*i);
    }

    public static ArrayList<Long> factorialNumbers(long n) {
        ArrayList al = new ArrayList();
        int i = 1;
        int factorial = 1;
        while (factorial <= n) {
            al.add(factorial);
            i++;
            factorial *= i;
        }
    return al;
    }


}