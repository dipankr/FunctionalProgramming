package com.functionalprogramming;

/*
 * @author : dipanker
 */

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println(1 +" "+ isPrime(1));
		System.out.println(2 +" "+ isPrime(2));
		System.out.println(3 +" "+ isPrime(3));
		System.out.println(4 +" "+ isPrime(4));
		System.out.println(5 +" "+ isPrime(5));
	}
	
	public static boolean isPrime(int number) {
		IntPredicate isDivisible = divisor -> number % divisor == 0;
		
		return number > 1 && 
				IntStream.range(2, number)
						 .noneMatch(isDivisible);
	}
}
