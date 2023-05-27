package com.mission.dsain6months.stringprograms;

import java.util.Scanner;

public class MostRepeateWordInTheLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input line");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		String word = "";
		int maxCount = 0;
		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
				}
			}

			// >= condition makes the last most repeating word to display, if we want first word then just > is used
			if (count >= maxCount) {
				maxCount = count;
				word = words[i];
			}
		}

		System.out.println(word + " occurred " + maxCount + " times");
		sc.close();
	}

}
