package com.mission.dsain6months.basicprograms;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		//To generate a random number between 0<1, 0 inclusive
		double randomNumber=Math.random();
		System.out.println(randomNumber);
		//To generate a random number between specied min and max range
		int min=100;
		int max=200;
		int num=(int) (Math.random()*(max-min+1)+min);
		System.out.println(num);
		
		//To generate random number using Random class
		Random random=new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(10, 20));
		
		//To generate random number using ints() method introduced in Java8
		random.ints(5).forEach(System.out::println);
		random.ints(5, 1000, 1100).forEach(System.out::println);;
	}

}
