package com.mission.dsain6months.easyproblems;

import java.util.*; 
import java.io.*;

//Replace ab with c; bc with a; ca with b
//bcab -> ac -> b

public class StringReduction {

	  public static String StringChallenge(String str) {
	    String result="";
	    char[] cs=str.toCharArray();
	    int[] n=new int[3];
	    for(int i=0;i<cs.length;i++){
	      n[cs[i]-'a']++;
	    }
	    int num=(n[0]+n[1])*(n[1]+n[2])*(n[2]+n[0]);
	    if(num==0){
	      result=cs.length +"";
	    }else if((n[0]+n[1])%2==0 && (n[1]+n[2])%2==0 && (n[2]+n[0])%2==0){
	      result="2";
	    }else{
	      result="1";
	    }
	    return result;
	  }

	  public static void main (String[] args) {  
	    Scanner s = new Scanner(System.in);
	    System.out.print(StringChallenge(s.nextLine()));
	    s.close();
	  }
}
