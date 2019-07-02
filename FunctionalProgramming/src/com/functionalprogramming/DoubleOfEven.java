package com.functionalprogramming;

/*
 * @author : dipanker
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DoubleOfEven {
	public static void main(String[] args) {
		Predicate<Integer> isGreaterThan3 = n -> n > 3;
		Predicate<Integer> isEven = n -> n % 2 == 0;
		Function<Integer,Integer> makeDouble = n -> n * 2;
		
		// find the double of first even number greater than 3
		List<Integer> values = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);
		
		values.stream()
		  .filter(isGreaterThan3)
		  .filter(isEven)
		  .map(makeDouble)
		  .findFirst()
		  .ifPresent(System.out::println);
		
	}
}