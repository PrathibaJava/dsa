package com.mission.dsain6months.numberprograms;

public class SunnyNumber {

	public static void main(String[] args) {
		System.out.println(isSunny(143)?"Sunny":"Not Sunny");
		System.out.println(isSunny(168)?"Sunny":"Not Sunny");
		System.out.println(isSunny(25)?"Sunny":"Not Sunny");
		
	}
	
	public static boolean isSunny(int num) {
		if(Math.sqrt(num+1)%1>0)
			return false;
		return true;
	}

}
