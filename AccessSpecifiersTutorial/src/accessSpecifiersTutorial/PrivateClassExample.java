package accessSpecifiersTutorial;

public class PrivateClassExample {
	
	/***
	 * This class is used to demonstrate the scope of private
	 * data member and method
	***/
	
	//Creating a private data member of type String
	private String privateString = "Private Member of PrivateClassExample";
	
	//Creating a private method to access the data member
	private void privateMethod() {
		
		System.out.println("This is a private method in PrivateClassExample "
				+ "trying to access the private data member");
		System.out.println(privateString);
		
	}
	
}
