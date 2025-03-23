package com.google.dsa2025.g1patterns;

public class Pattern17 {
    public static void main(String[] args) {
        print(4);
    }
    public static void print(int n){
        for(int i=0;i<n;i++){
            char print = 'A';
            for(int j=1; j<=n-i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i+1;j++){
                if(j<=(2*i+1)/2){
                    System.out.print(print++ +" ");
                }else{
                    System.out.print(print-- +" ");
                }
            }
            for(int j=1; j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
