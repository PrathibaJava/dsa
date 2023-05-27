package com.mission.dsain6months.stringprograms;

public class SmallestAndBiggestPalindrome {

	public static void main(String[] args) {
		String str = "Wow you wow own kayak madam";
		String[] split = str.split(" ");
		int[] count = new int[split.length];
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			if (isPalindrome(split[i])) {
				System.out.println(split[i]);
				count[i] = split[i].length();
			} else {
				count[i] = -1;
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
		int min = count.length, max = 0;
		String minWord = "", maxWord = "";
		for (int i = 1; i < count.length; i++) {
			if (min >= count[i] && count[i] != -1) {
				min = count[i];
				minWord = split[i];
			}

			// <= makes it to print the last largest word
			if (max <= count[i]) {
				max = count[i];
				maxWord = split[i];
			}
		}
		System.out.println();
		System.out.println(minWord + " " + maxWord);
	}

	public static boolean isPalindrome(String str) {
		if (str.length() == 0) {
			return false;
		} else if (str.length() == 1) {
			return true;
		} else if (str.length() > 1) {
			String reverse = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				reverse = reverse + str.charAt(i);
			}
			if (str.equals(reverse)) {
				return true;
			}
		}
		return false;
	}
}
