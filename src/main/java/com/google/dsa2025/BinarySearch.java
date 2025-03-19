package com.google.dsa2025;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10,20,30,21,78,98,56};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int target=21;
        System.out.println(binarySearch(arr, target));

    }

    public static int binarySearch(int[] arr, int target){
        int left=0;
        int right=arr.length - 1;
        //int mid=0;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]>target){
                right=mid-1;
            } else{
                left=mid+1;
            }
        }
        return -1;
    }
}
