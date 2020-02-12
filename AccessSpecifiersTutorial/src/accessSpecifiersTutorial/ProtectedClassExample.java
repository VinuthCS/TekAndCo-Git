package accessSpecifiersTutorial;

public class ProtectedClassExample {
	
	/***
	 * This class is used to demonstrate the scope of protected
	 * data member and method
	***/
	
	//Creating a protected data member of type String
	protected static String protectedString = "Protected Member of ProtectedClassExample";
	
	//Creating a protected method to access the data member
	protected static void protectedMethod() {
		
		System.out.println("This is a protected method in ProtectedClassExample "
				+ "trying to access the protected data member");
		System.out.println(protectedString);
		
	}

}
