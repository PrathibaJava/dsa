package com.mission.dsain6months.easyproblems;

import java.util.*; 
import java.io.*;

public class HTMLFormatting {

	// "<div><div><b></b></div></p>"
	public static String[][] htmlElements={{"b","/b"},{"div","/div"},{"em","/em"},{"i","/i"},{"p","/p"}};

	  public static boolean isOpeningElement(String str){
	    for(String[] array:htmlElements){
	      if(array[0].equals(str)){
	        return true;
	      }
	    }
	    return false;
	  }

	  public static boolean matches(String opening, String closing){
	    for(String[] array:htmlElements){
	      if(array[0].equals(opening)){
	        return array[1].equals(closing);
	      }
	    }
	    return false;
	  }

	  public static String processFinalOutput(String str){
	    StringBuffer sb=new StringBuffer();
	    String challengeToken="r6wiack45b";
	    for(int i=0;i<str.length();i++){
	      if(challengeToken.contains(str.charAt(i) + "")){
	        sb.append("--" + str.charAt(i) + "--");
	      }else{
	        sb.append(str.charAt(i));
	      }
	    }
	    return sb.toString();
	  }

	  public static String StringChallenge(String str) {
	    
	    String[] strArray = str.split("[<>]");
	    ArrayList<String> arrayList=new ArrayList<String>(); 

	    for(String s:strArray){
	      for(String[] htmlElementArray:htmlElements){
	        if(s.equals(htmlElementArray[0]) || s.equals(htmlElementArray[1])){
	          arrayList.add(s);
	        }
	      }
	    }
	    if(arrayList.size()==1){
	      return arrayList.get(0);
	    }
	    Stack<String> stack=new Stack<String>();
	    for(int i=0;i<arrayList.size();i++){
	      if(isOpeningElement(arrayList.get(i))){
	       stack.push(arrayList.get(i));
	      }else{
	        String openingElement=stack.pop();
	        stack.push(openingElement);
	        if(stack.isEmpty() || !matches(stack.pop(),arrayList.get(i)) ){
	        	return processFinalOutput(openingElement);
	        } 
	      }
	    }
	    return "true";
	  }

	  public static void main (String[] args) {  
	    Scanner s = new Scanner(System.in);
	    System.out.print(StringChallenge(s.nextLine()));
	    s.close();
	  }
}

