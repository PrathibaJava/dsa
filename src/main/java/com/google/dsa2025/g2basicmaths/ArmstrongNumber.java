package com.google.dsa2025.g2basicmaths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        print(18);
    }

    public static void print(int n){
        int number=n;
        int rem=0;
        int sum=0;
        int digits=(int)Math.log10(n)+1;
        while(n>0){
            rem=n%10;
            sum=sum+(int)(Math.pow(rem,digits));
            n=n/10;
        }
        if(number==sum) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}
