package com.google.dsa2025.g1patterns;

public class Pattern10 {

    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        for(int i=1;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
