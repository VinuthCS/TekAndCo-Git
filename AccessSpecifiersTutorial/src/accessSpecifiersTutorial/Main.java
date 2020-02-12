package accessSpecifiersTutorial;

public class Main {

	public static void main(String[] args) {
		
		//Creating an instance of PrivateClassExample
		PrivateClassExample privateClassExample = new PrivateClassExample();
		
		System.out.println("Trying to access the data member and method "
				+ "of PrivateClassExample");
		
		/***
		 * Below lines will throw error because the member and method are private
		 * and can not be accessed outside the PrivateClassExample
		 ***/
		
		//System.out.println(privateMethod.privateString);
		//privateClassExample.privateMethod();
		
		//Creating an instance of PrivateClassExample
		ProtectedClassExample protectedClassExample = new ProtectedClassExample();
				
		System.out.println("Trying to access the data member and method "
						+ "of ProtectedClassExample");
				
		/***
		 * Below lines will throw error because the member and method are private
		 * and can not be accessed outside the PrivateClassExample
		 ***/
				
		System.out.println(protectedClassExample.protectedString);
		protectedClassExample.protectedMethod();
		
		

	}

}
