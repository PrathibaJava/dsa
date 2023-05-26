package com.mission.dsain6months.stringprograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		String str="picture perfect";
		int[] a=new int[str.length()];
		int visited=-1;
		
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
					a[j]=visited;
				}
			}
			if(a[i]!=visited) {
				a[i]=count;
			}
		}
		System.out.println("-------------------------");
		System.out.println("Characters|Frequency");
		System.out.println("-------------------------");
		for(int i=0;i<a.length;i++) {
			if(a[i]!=visited && str.charAt(i)!=' ')
			System.out.println("  "+str.charAt(i)+"   |    "+a[i]);
		}
	}

}
