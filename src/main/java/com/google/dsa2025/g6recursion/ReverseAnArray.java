package com.google.dsa2025.g6recursion;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 14, 15};
        int[] arr1 = {100, 110, 120, 130, 140, 150};
        for(int i:arr){
            System.out.println(i);
        }
        reverse(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
        Arrays.stream(arr).forEach(System.out::print);

        System.out.println("-------------------------------------");

        withOutRecursion(arr1);
        Arrays.stream(arr1).forEach(System.out::print);
    }

    public static void reverse(int[] arr, int begin, int end){
        if(begin >= end){
            return;
        }
        int temp = arr[end];
        arr[end] = arr[begin];
        arr[begin] = temp;
        reverse(arr, begin+1, end-1);
    }

    public static void withOutRecursion(int[] arr){
        int temp;
        int n=arr.length-1;

        for(int i=0; i<arr.length/2; i++){
            temp=arr[n-i];
            arr[n-i]=arr[i];
            arr[i]=temp;
        }
    }
}


