package com.mission.dsain6months.stringprograms;

public class LargestAndSmallestWordInLine {

	public static void main(String[] args) {
		String str="Hardships often prepare ordinary people for an extraordinary destiny";
		String[] words=str.split(" ");
		int[] length=new int[words.length];
		for(int i=0;i<words.length;i++) {
			length[i]=words[i].length();
		}
		
		int largest=0;
		int smallest=Integer.MAX_VALUE;
		String smallWord="";
		String largeWord="";
		for(int i=0;i<words.length;i++) {
			if(smallest>length[i]) {
				smallest=length[i];
				smallWord=words[i];
			}	
			if(largest<length[i]) {
				largest=length[i];
				largeWord=words[i];
			}
		}
		
		System.out.println("Largest word is: "+largeWord);
		System.out.println("Smallest word is: "+smallWord);
	}

}
