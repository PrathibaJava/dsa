package com.mission.dsain6months.stringprograms;

public class DivideStringIntoNParts {

	public static void main(String[] args) {
		String str="aaaabbbbcccc";
		int n=3;
		
		if(str.length()%n!=0) {
			System.out.println("String cannot be divided into equal parts");
		}else {
			int charsInPart=str.length()/n;
			String[] equalParts=new String[charsInPart];
			int temp=0;
			for(int i=0;i<str.length();i=i+charsInPart) {
				equalParts[temp]=str.substring(i, i+charsInPart);
				temp++;
			}
			for(int i=0;i<temp;i++) {
				System.out.println(equalParts[i]);
			}
		}
	}

}
