package com.google.dsa2025.g1patterns;

public class Pattern7 {
    public static void main(String[] args) {
        print(6);
    }

    public static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
