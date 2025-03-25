package com.google.dsa2025.g1patterns;

public class Pattern18 {
    public static void main(String[] args) {
        print(5);
        print1(5);
    }
    public static void print(int n){
        char start = (char) (64+n);
        for(int i=0;i<n;i++){
            char print = start;
            for(int j=0;j<=i;j++){
                System.out.print(print++ + " ");
            }
            start = --start;
            System.out.println();
        }
    }
    public static void print1(int n){
        for(int i=0;i<n;i++){
            for(char j= (char)(64+n-i);j<=(64+n);j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
