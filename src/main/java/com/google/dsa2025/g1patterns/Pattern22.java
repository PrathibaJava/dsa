package com.google.dsa2025.g1patterns;

public class Pattern22 {
    public static void main(String[] args) {
        print(3);
    }
    public static void print(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int top = i;
                int left = j;
                int bottom = (2*n-1)-1-i;
                int right = (2*n-1)-1-j;
                System.out.print(n-Math.min((Math.min(left,right)),(Math.min(top,bottom))));
            }
            System.out.println();
        }
    }
}
