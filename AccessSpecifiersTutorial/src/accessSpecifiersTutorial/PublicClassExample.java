package accessSpecifiersTutorial;

public class PublicClassExample {
	
	/***
	 * This class is used to demonstrate the scope of public
	 * data member and method
	***/
	
	//Creating a private data member of type String
	public static String publicString = "Public Member of PublicClassExample";
	
	//Creating a public method to access the data member
	public static void publicMethod() {
		
		System.out.println("This is a public method in PublicClassExample "
				+ "trying to access the public data member");
		System.out.println(publicString);
		
	}

}
