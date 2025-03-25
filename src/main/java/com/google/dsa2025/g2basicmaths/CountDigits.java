package com.google.dsa2025.g2basicmaths;

/*
Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.
A digit d of n divides n evenly if the remainder when n is divided by d is 0 (n % d == 0).
Digits of n should be checked individually. If a digit is 0, it should be ignored because division by 0 is undefined.
Input: n = 12
Output: 2
Explanation: 1, 2 when both divide 12 leaves remainder 0.
*/
public class CountDigits {
    public static void main(String[] args) {
        print(23);
    }

    public static void print(int n){
        int rem=0;
        int count=0;
        int number = n;
        while(number>0){
            rem = number%10;
            if(rem!=0 && n%rem==0){
                count+=1;
            }
            number = number/10;
        }
        System.out.println(count);
    }
}
