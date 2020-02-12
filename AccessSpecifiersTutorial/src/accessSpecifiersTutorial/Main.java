package accessSpecifiersTutorial;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Trying to access the data member and method "
				+ "of PrivateClassExample");
		
		/***
		 * Below lines will throw error because the member and method are private
		 * and can not be accessed outside the PrivateClassExample
		 ***/
		
		//System.out.println(PrivateClassExample.privateString);
		//PrivateClassExample.privateMethod();
				
		System.out.println("Trying to access the data member and method "
						+ "of ProtectedClassExample");
		ProtectedClassExample.protectedMethod();
		
		System.out.println("Trying to access the data member and method "
				+ "of ProtectedClassExample by using ProtectedChildClass");
		ProtectedChildClass.protectedChildMethod();
		
		System.out.println("Trying to access the data member and method "
				+ "of PublicClassExample");
		PublicClassExample.publicMethod();
		
		

	}

}
