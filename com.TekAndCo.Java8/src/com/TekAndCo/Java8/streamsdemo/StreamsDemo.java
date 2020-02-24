package com.TekAndCo.Java8.streamsdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 
 * @author vinuth
 *
 * This Class demonstrates the use of streams and some methods
 * offered by the Stream Class
 * Lazy/Intermediate/Non Terminal Methods will be invoked by
 * Eager/Terminal Methods
 *
 */

public class StreamsDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=10;i++)
			list.add(i);
		//using map function to double the value of all numbers in the list
		int doubleSum =list.stream().map(i->i+i)
		//using reduce function to accumulate the sum
							.reduce(0,Integer::sum);
		System.out.println("Sum of double of all numbers from 1 to 10: "+doubleSum);
		
		//Using filter to filter out all the even values
		Integer evenFirst = list.stream().filter(i->i%2==0)
		//Using findFirst to find the first even number 
										.findFirst().orElse(new Integer(0));
		
		System.out.println("First even number in the list is: "+evenFirst);

	}

}
