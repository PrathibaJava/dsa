package com.google.dsa2025.g2basicmaths;

public class GCDOrHCF {
    public static void main(String[] args) {
        print(40,20);
        print1(40,20);
        print2(40,20);
    }
    public static void print(int a, int b){
        int gcd=1;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
    public static void print1(int a, int b){
        int gcd=1;
        for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);
    }
    public static void print2(int a, int b){
        int gcd=1;
        while(a>0 && b>0){
            if(a>b) a=a%b;
            else b=b%a;
            if(a==0) gcd=b;
            else gcd=a;
        }
        int lcm=(a*b)/gcd;
        System.out.println(gcd);
    }

}
