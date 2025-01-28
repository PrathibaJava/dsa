package com.google.dsa2025.g6recursion;

public class SumOfFirstNTerms {

    public static void main(String[] args) {
        System.out.println(nTerms(5));
    }

    public static int nTerms(int n){
        if(n == 1){
            return 1;
        }
        return (int)Math.pow(n,3) + nTerms(n-1);
    }
}
