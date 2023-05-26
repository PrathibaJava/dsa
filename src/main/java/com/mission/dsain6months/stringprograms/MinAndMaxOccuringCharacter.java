package com.mission.dsain6months.stringprograms;

public class MinAndMaxOccuringCharacter {

	public static void main(String[] args) {
		String str="grass is greener on the other side";
		int min,max;
		int[] fr=new int[str.length()];
		int visited=-1;
		
		for(int i=0;i<str.length();i++) {
			int count=1;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && str.charAt(j)!=' ') {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited) {
				fr[i]=count;
			}
		}
		
		min=max=fr[0];
		char minChar=str.charAt(0);
		char maxChar=str.charAt(0);
		for(int i=1;i<fr.length;i++) {
			if(min>fr[i] && fr[i]!=visited) {
				min=fr[i];
				minChar=str.charAt(i);
			}
			
			if(max<fr[i]) {
				max=fr[i];
				maxChar=str.charAt(i);
			}
		}
		System.out.println("min occurences is: "+ min+" "+minChar);
		System.out.println("max occurences is: "+ max+" "+maxChar);	
	}
}
