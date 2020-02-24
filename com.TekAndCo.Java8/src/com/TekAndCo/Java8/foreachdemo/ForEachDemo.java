package com.TekAndCo.Java8.foreachdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author vinuth
 * 
 * This Class is used to demonstrate the implementation of
 * the internal ForEach function which was added to the 
 * Collections framework with the Java 1.8 update
 *
 */



public class ForEachDemo {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Hello");
		list.add(2);
		list.add(4.4);
		
		System.out.println("Printing elements of the list using enhanced for loop");
		
		for(Object obj:list)
			System.out.println(obj);
		
		System.out.println("Printing elements of the list using enhanced for loop");
		
		list.forEach(obj->System.out.println(obj));

	}
		

}
