package com.google.dsa2025.g2basicmaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllDivisors {
    public static void main(String[] args) {
        print(4);
        print1(4);
    }

    public static void print(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0) System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void print1(int n){
        List<Integer> l = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                l.add(i);
                if(n/i!=i) l.add(n/i);
            }
        }
        Collections.sort(l);
        int sum=0;
        for(int i:l){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
