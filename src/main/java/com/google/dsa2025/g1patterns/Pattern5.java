package com.google.dsa2025.g1patterns;

public class Pattern5 {

    public static void main(String[] args) {
        pattern5(5);
    }

    public static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
