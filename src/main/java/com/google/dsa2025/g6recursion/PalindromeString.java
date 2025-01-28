package com.google.dsa2025.g6recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str="HELLO";
        System.out.println(palindromeWithRecursion(str, 0, str.length()-1));

        String str1="A man, a plan, a canal: Panama";
        System.out.println(palindromeWithOutRecursion(str1));
    }

    public static boolean palindromeWithRecursion(String str, int begin, int end){
        if(begin>=end){
            return true;
        }
        if(str.charAt(begin) != str.charAt(end)) return false;
        return palindromeWithRecursion(str, begin+1, end-1);
    }

    public static boolean palindromeWithOutRecursion(String str){
        if(str.isEmpty()){
            return true;
        }
        int begin = 0;
        int end = str.length()-1;
        while(begin<=end){
            char first = str.charAt(begin);
            char last = str.charAt(end);
            if(!Character.isLetterOrDigit(first)){
                begin++;
            } else if(!Character.isLetterOrDigit(last)){
                end--;
            } else {
                if(Character.toLowerCase(first) != Character.toLowerCase(last)){
                    return false;
                }
                begin++;
                end--;
            }
        }
        return true;
      /*  str=str.replaceAll("[^a-zA-Z]","").toLowerCase();
        System.out.println(str);

        int end = str.length()-1;
        for(int i=0; i<=str.length()/2;i++){
            if(str.charAt(i) != str.charAt(end-i)) return false;
        }
        return true;*/
    }
}
