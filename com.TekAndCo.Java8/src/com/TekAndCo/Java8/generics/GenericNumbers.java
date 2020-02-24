package com.TekAndCo.Java8.generics;

/**
 * 
 * @author vinuth
 * 
 * This class accepts only data types which extends Number Class 
 *
 */

public class GenericNumbers <E extends Number>{
	
	E item;

	public E getItem() {
		return item;
	}

	public void setItem(E item) {
		this.item = item;
	}

}
