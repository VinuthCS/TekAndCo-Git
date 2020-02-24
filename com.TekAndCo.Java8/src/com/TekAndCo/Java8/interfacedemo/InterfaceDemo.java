package com.TekAndCo.Java8.interfacedemo;


/***
 * 
 * @author vinuth
 * 
 * Before 1.8 interface in java could not implement methods
 * With the 1.8 update, we can implement methods using static/default keywords
 * Methods of super class cannot be overridden
 * 
 * Default keyword cannot be used in classes
 *
 */

public interface InterfaceDemo {
	
	static void ShowStatic() {
		System.out.println("Hello static from InterfaceDemo");
	}
	
	default void ShowDefault() {
		System.out.println("Hello Default from InterfaceDemo");
	}
	
	void Show();
	
	//Cannot override methods from super class
	//	default boolean equals(Object obj) {
	//			
	//	}

}
