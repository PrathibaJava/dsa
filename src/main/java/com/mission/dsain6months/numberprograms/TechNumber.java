package com.mission.dsain6months.numberprograms;

public class TechNumber {

	public static void main(String[] args) {
		System.out.println(isTechNumber(2025)?"Tech":"Not Tech");
		System.out.println(isTechNumber(9181)?"Tech":"Not Tech");
		System.out.println(isTechNumber(9801)?"Tech":"Not Tech");
	}
	
	public static boolean isTechNumber(int num) {
		int temp=num;
		int count=0;
		int firstHalf, secondHalf=0;
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		if(count%2!=0)
			return false;
		temp=num;
		firstHalf=(int) (num/Math.pow(10, count/2));
		secondHalf=(int) (num%Math.pow(10, count/2));
		int sum=(firstHalf+secondHalf)*(firstHalf+secondHalf);
		if(sum==num)
			return true;
		else
			return false;
	}

	public static boolean isEven(int n) {
		if(n%2==0)
			return true;
		return false;
	}
}
