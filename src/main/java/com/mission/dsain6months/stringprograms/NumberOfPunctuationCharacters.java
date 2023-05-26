package com.mission.dsain6months.stringprograms;

public class NumberOfPunctuationCharacters {

	public static void main(String[] args) {
		//!, . , ' , - , " , ? , ; 
		String s1="He said, 'The mailman loves you.' I heard it with my own ears.";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='!'||s1.charAt(i)==','||s1.charAt(i)==':'||s1.charAt(i)=='.'||s1.charAt(i)=='\''||s1.charAt(i)=='-'
				||s1.charAt(i)=='\"'||s1.charAt(i)=='?'||s1.charAt(i)==';'){
						count++;
					}
		}
		System.out.println("Number of punctuation marks is: "+count);
	}

}
