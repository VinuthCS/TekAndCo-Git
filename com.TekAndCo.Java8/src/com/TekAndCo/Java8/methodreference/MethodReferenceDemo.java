package com.TekAndCo.Java8.methodreference;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author vinuth
 *
 * Demonstrating the use of method reference (::)
 * A method can be implemented in a interface and the same method can be 
 * reused with the help of method reference and is more helpful than 
 * lambda expressions because it can be reused
 *  
 */

public class MethodReferenceDemo implements MethodReferenceInterface{
	
	public static void main(String[] args) {
		
		List<String> listString = new ArrayList<>();
		
		listString.add(" Hello. ");
		listString.add(" Welcome ");
		listString.add(" to ");
		listString.add(" Java 8.");
		
		System.out.println("Printing using Static function");
		
		listString.forEach(MethodReferenceInterface::printStatic);
		System.out.println();
		
		System.out.println("Printing using Default function");
		//For non static methods, objects need to be created
		MethodReferenceDemo demo = new MethodReferenceDemo();
		listString.forEach(demo::printDefault);
	}

}
