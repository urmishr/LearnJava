package JavaClass;

public class ClassAndMethods {
	
	String firstName = "Urmish";
	String lastName = "Ramani";
	
	public void userInfo() {
		//This Method contains some user information
		
		System.out.println("Hello " + firstName +  " " + lastName);
		
	}

	public static void main(String[] args) {
		
		//Creating new object.
		ClassAndMethods printUser = new ClassAndMethods();
		
		//Calling a method on an object.
		printUser.userInfo();

	}

}
