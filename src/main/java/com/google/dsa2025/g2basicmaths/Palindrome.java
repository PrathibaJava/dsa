package com.google.dsa2025.g2basicmaths;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(print(123));
    }

    public static int print(int n){
        int revNum=0;
        int number = n;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            revNum=(revNum*10)+rem;
        }
        if(number==revNum) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
        return revNum;
    }
}
