package com.TekAndCo.Java8.generics;

/**
 * 
 * @author vinuth
 *
 *         This class is used to demo the concept of Generic Data Types
 * 
 *         Generic data types are used as place holders in order to maintain
 *         strict types in collections. By using Generics, we can avoid hard
 *         coding of data tyes and reuse the same code for different data types
 */

public class GenericsDemo {

	public static void main(String[] args) {

		// Creating a generic object of type integer

		GenericClass<Integer> genInt = new GenericClass<>();
		genInt.setItem(1);
		System.out.println(genInt.getItem());

		// Trying to set non integer to Integer Type generic class which is not allowed
		// genInt.setItem("Hello");

		// reusing the same class to accept strings
		GenericClass<String> genStr = new GenericClass<>();
		genStr.setItem("Hello");
		System.out.println(genStr.getItem());

		// Trying to set integer to String Type generic class which is not allowed
		// genStr.setItem(2);

		// Restricting the class to work with Numbers
		
		// Working with Integer
		GenericNumbers<Integer> genIntNum = new GenericNumbers();
		genIntNum.setItem(2);
		System.out.println(genIntNum.getItem());

		// Working with Float
		GenericNumbers<Float> genFloatNum = new GenericNumbers();
		genFloatNum.setItem(4.4f);
		System.out.println(genFloatNum.getItem());

		// Strings are not allowed
		//GenericNumbers<String> genStrNum = new GenericNumbers();

		

	}

}
