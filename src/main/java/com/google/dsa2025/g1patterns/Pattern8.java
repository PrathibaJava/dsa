package com.google.dsa2025.g1patterns;

public class Pattern8 {

    public static void main(String[] args) {
        print(6);
    }

    public static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*n)-(2*i)-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
