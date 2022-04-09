package Methods;

public class ReturnValue {
	
	public static String  userName(String uName) {
		
		return "Entered username is : " + uName;
		
		//This method will return the value of uName
	}

	public static void main(String[] args) {

		System.out.println(userName("Urmish"));
		//Calling method userName is returning value that we set.
		
	}

}
