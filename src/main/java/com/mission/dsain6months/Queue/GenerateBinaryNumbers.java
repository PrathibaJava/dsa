package com.mission.dsain6months.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

	public static void main(String[] args) {
		String[] s=generateBinaryNumbers(4);
		for(String s1:s) {
			System.out.print(s1+" ");
		}
		System.out.println();
	}
	
	public static String[] generateBinaryNumbers(int n) {
		String[] result=new String[n];
		Queue<String> q=new LinkedList<>();
		q.offer("1");
		for(int i=0;i<n;i++) {
			result[i]=q.poll();
			String s1=result[i]+"0";
			String s2=result[i]+"1";
			q.offer(s1);
			q.offer(s2);
		}
		return result;
	}

}
