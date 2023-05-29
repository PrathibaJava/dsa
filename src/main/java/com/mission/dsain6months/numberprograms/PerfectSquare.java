package com.mission.dsain6months.numberprograms;

public class PerfectSquare {

	public static void main(String[] args) {
		double n=25;
		double square=Math.sqrt(n);
		if(square-Math.floor(square)==0) {
			System.out.println(n+" is a perfect square");
		}else {
			System.out.println(n+" is not a perfect square");
		}
		perfectSquare(121);
	}

	public static void perfectSquare(int n) {
		for(int i=1;i*i<=n;i++) {
			if(n%i==0 && n/i==i) {
				System.out.println(n+" is a perfect square");
			}
		}
	}
}
