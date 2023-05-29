package com.mission.dsain6months.numberprograms;

public class GCDOfTwoNumbers {

	//Brute force - Time complexity is O(min(a,b))
	public static void main(String[] args) {
		int n1=11;
		int n2=33;
		int temp=0;
		
		int min=n1<n2?n1:n2;
		for(int i=min;i>0;i--) {
			if(n1%i==0 && n2%i==0) {
				temp=i;
				break;
			}
		}	
		System.out.println("GCD of the two numbers is: "+temp);
		euclidAlgorithm(173, 133);
		gabrielAlgorithm(50, 60);
	}

	//Time complexity is O(min(a,b))
	public static void euclidAlgorithm(int a, int b) {
		//find largest number
		//replace largest number with difference of two numbers
		//repeat until both numbers are equal
		while(a!=b) {
			if(a>b) {
				a=a-b;
			}else {
				b=b-a;
			}
		}
		System.out.println("GCP is "+a);
	}
	
	//Time complexity is O(log(min(a,b))
	public static void gabrielAlgorithm(int a, int b) {
		//find the smallest number 
		//Find the remainder of largest%smallest and replace it with largest number
		//repeat until one number becomes zero
		while(a!=0 && b!=0) {
			if(a>b) {
				a=a%b;
			}else {
				b=b%a;
			}
		}
		
		int gcp=(a!=0)?a:b;
		System.out.println("GCF from Gabriel Algorithm is: "+ gcp);
	}
}
