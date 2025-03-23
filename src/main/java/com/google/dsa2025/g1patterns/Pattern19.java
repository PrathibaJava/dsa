package com.google.dsa2025.g1patterns;

public class Pattern19 {
    public static void main(String[] args) {
        print(3);
    }
    public static void print(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(2*i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<=n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*n-2*i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
