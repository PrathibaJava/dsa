package com.mission.dsain6months.stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] a = { 4, 7, 3, 4, 8, 1 };
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[j] > a[i]) {
					b[i] = a[j];
					break;
				}
			}
			if (b[i] == 0)
				b[i] = -1;
		}

		System.out.println(a.length);
		System.out.println(b.length);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		
		nextGreaterElement();
	}

	public static void nextGreaterElement() {
		int[] a = { 4, 7, 3, 4, 8, 1 };
		int[] result = new int[a.length];
		Stack s = new Stack();
		for (int i = a.length - 1; i >= 0; i--) {
			if (!s.isEmpty()) {
				while (!s.isEmpty() && s.peek() <= a[i]) {
					s.pop();
				}
			}
			if(s.isEmpty()) {
				result[i]=-1;
			}else {
				result[i]=s.peek();
			}
			s.push(a[i]);
		}
		
		for(int i=0; i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println();
	}

}
