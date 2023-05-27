package com.mission.dsain6months.stringprograms;

public class DuplicateWordsinLine {

	public static void main(String[] args) {
		String str="Big big big black bug bit a big nose black dog on his big black nose bug bit";
		String[] words=str.split(" ");
		
		for(int i=0;i<words.length;i++) {
			int count=1;
			if(!words[i].equals("0")) {
				for(int j=i+1;j<words.length;j++) {
					if(words[i].equals(words[j])) {
						count++;
						words[j]="0";
					}
				}
				if(count>1) {
					System.out.println(words[i]);
				}
			}
		}
	}

}
