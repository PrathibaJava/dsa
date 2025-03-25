package com.google.dsa2025.g2basicmaths;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(print(-12));
    }

    public static int print(int n){
        int revNum = 0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        while(n!=0){
            int rem=n%10;
            n/=10;
            if (revNum > max / 10 || (revNum == max / 10 && rem > 7)) {
                return 0; // Overflow
            }
            if (revNum < min / 10 || (revNum == min / 10 && rem < -8)) {
                return 0; // Underflow
            }
            revNum=(revNum*10)+rem;
        }
        return revNum;
    }
}
