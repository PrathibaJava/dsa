package com.mission.dsain6months.numberprograms;

public class FascinatingNumber {

	public static void main(String[] args) {
		int num=327;
		int r1=num*2;
		int r2=num*3;
		String r=num+""+r1+r2;
		System.out.println(r);
		char[] ch=r.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);
		for(int i=1;i<=9;i++) {
			int count=0;
			System.out.println("Inside first for");
			for(int j=0;j<ch.length;j++) {
				System.out.println("Second");
				System.out.println(ch[j]+" "+ i);
				if(i==(int)ch[j]) {
					++count;
					System.out.println(ch[j]+" "+ i);
				}
					
			}
			System.out.println(count);
			
			if(count>1 || count==0) {
				System.out.println("Not a fascinating number");
				break;
			}	
		}
	}
}

