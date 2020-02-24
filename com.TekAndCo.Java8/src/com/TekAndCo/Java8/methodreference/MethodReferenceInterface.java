package com.TekAndCo.Java8.methodreference;

public interface MethodReferenceInterface {
	
	static void printStatic(String s) {
		System.out.print(s);
	}
	
	default void printDefault(String s) {
		System.out.print(s);
	}

}
