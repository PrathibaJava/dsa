package com.mission.dsain6months.stringprograms;

import java.util.Scanner;

public class NumberOfWordsInLine {

	public static void main(String[] args) {
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input line");
			String str=sc.nextLine();
			String[] strArr=str.split(" ");
			count=count+strArr.length;
		sc.close();
		System.out.println("Number of Words entered: "+ count);
		
	}

}
