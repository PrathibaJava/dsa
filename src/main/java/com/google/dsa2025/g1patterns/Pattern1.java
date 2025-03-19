package com.google.dsa2025.g1patterns;

public class Pattern1 {

/* 4 steps: Patterns will have nested loops
1) Outer loop - For rows, count the number of lines/rows
2) Inner loop - For columns, focus on columns and connect them somehow to the rows
3) Print whatever in the inner for loop
4) Observe symmetry in the pattern (optional step)

https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/*/

    public static void main(String[] args) {
        pattern1(4);
    }

    public static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
