package com.google.dsa2025.g6recursion;

public class G1PrintNameNTimes {

    public static void main(String[] args) {
        printName(5);
    }

    public static void printName(int n){
       if(n==0){
           return;
       }
       System.out.println("Google");
           printName(--n);
    }
}
