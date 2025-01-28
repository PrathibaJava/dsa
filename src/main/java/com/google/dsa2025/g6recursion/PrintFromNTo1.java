package com.google.dsa2025.g6recursion;

public class PrintFromNTo1 {
    public static void main(String[] args) {
        printRecursion(5);
        printBacktrack(1,5);
    }

    public static void printRecursion(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printRecursion(--n);
    }

    public static void printBacktrack(int i, int n){
        if(i>5){
            return;
        }
        printBacktrack(i+1, n);
        System.out.println(i);
    }
}
