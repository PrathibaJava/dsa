package com.google.dsa2025.g2basicmaths;

public class PrimeNumber {
    public static void main(String[] args) {
        print(5);
    }

    public static void print(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                count++;
                if(n/i !=i) count++;
            }
        }
        if(count==2) System.out.println("Prime");
        else System.out.println("Not a prime");
    }
}
