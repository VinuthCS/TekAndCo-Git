package accessSpecifiersTutorial;

public class ProtectedChildClass extends ProtectedClassExample{
	
	/***
	 * This a child class of ProtectedClassExample and is used to 
	 * demonstrate the scope of protected data member and method
	 * from the parent class
	***/
	
	
	//Creating a public method to access the data member of parent
	public void protectedChildMethod() {
		
		System.out.println("This is a public method in ProtectedChildClass "
				+ "trying to access the protected data member of the parent");
		System.out.println(protectedString);
		
	}

}
