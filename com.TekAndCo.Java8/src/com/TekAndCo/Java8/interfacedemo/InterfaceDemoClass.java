package com.TekAndCo.Java8.interfacedemo;

public class InterfaceDemoClass //extends ExtendsDemo
								implements InterfaceDemo
								//,SecondInterface
	{
	public static void main(String[] arg) {
		
		//Calling Static Method implemented in the Interface
		InterfaceDemo.ShowStatic();
		
		//Calling ShowStatic to demonstrate the preference of extends
		//InterfaceDemoClass.ShowStatic();
		
		//Creating an object to call the Default method
		InterfaceDemoClass interfaceClass = new InterfaceDemoClass();
		
		//Calling Default Method implemented in the Interface
		interfaceClass.ShowDefault();
		
		//Calling Show Method which is overriden in this class
		interfaceClass.Show();
		
	}
	
	//Overriding the unimplemented show method from the interface
	@Override
	public void Show() {
		System.out.println("Overriding show method from Interface");
	}
	
}
