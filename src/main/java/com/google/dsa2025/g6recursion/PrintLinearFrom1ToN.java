package com.google.dsa2025.g6recursion;

public class PrintLinearFrom1ToN {
    public static void main(String[] args) {
        printLinear(1, 5);
        printBacktrack(5, 5);
    }

    public static void printLinear(int i, int n){
        if(i>n){
            return;
        }
        System.out.print(i);
        printLinear(++i, n);
    }

    public static void printBacktrack(int i, int n){
        if(i==0){
            return;
        }
        printBacktrack(i-1, 5);
        System.out.println(i);
    }
}
