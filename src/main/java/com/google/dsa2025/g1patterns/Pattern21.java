package com.google.dsa2025.g1patterns;

public class Pattern21 {
    public static void main(String[] args) {
        print(4);
    }
    public static void print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1; j<=n;j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
