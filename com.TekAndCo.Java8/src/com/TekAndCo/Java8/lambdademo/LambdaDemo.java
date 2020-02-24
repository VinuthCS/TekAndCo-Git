package com.TekAndCo.Java8.lambdademo;
/**
 * 
 * @author vinuth
 * 
 * Lambda Expressions (->) can be used to avoid unnecessary creation of 
 * Anonymous Inner Classes and also remove the unnecessary Boiler Plate Code.
 * The Return Type and the Data Type of the parameters can also be ignored.
 * This is applicable to only the methods defined in the Interface
 *
 */

public class LambdaDemo{

	public static void main(String[] args){
		
		System.out.println("Using Anonymous Inner Classes");
		int num1 = 2;
		
		LambdaInterface li1 = new LambdaInterface() {
			
			@Override
			public int Square(int num) {
				
				return (num*num);
			}
		};
		num1 = li1.Square(num1);
		System.out.println("The value of Num is "+num1);
		
		System.out.println("Using Lambda Expression");
		num1 = 2;
		LambdaInterface li2 = num2 -> num2*num2;
		System.out.println("The value of Num is "+li2.Square(num1));

	}

}
