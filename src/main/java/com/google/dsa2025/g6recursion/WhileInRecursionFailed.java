package com.google.dsa2025.g6recursion;

public class WhileInRecursionFailed {
    public static void main(String[] args) {
        printLinear(3);
    }

    public static void printLinear(int n){
        while(n>0){
            System.out.println(n);
            printLinear(--n);
        }
    }
}
