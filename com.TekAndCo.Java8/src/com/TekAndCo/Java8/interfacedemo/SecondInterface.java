package com.TekAndCo.Java8.interfacedemo;
/**
 * 
 * @author vinuth
 * 
 * This class just contains a dummy default method 
 * to demonstrate the preference of extends over implements
 *
 */

public interface SecondInterface {
	
	static void ShowStatic() {
		System.out.println("Hello Default from SecondInterface");
	}

}
