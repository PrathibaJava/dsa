package com.google.dsa2025.g1patterns;

public class Pattern16 {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        char print = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(print+" ");
            }
            print++;
            System.out.println();
        }
    }
}
