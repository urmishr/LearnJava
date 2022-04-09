package Methods;

public class JavaScope {

	public static void main(String[] args) {
		//Whatever code comes in {} is a scope of that method.
		// Code here CANNOT use x
		 
	    int x = 100;

	    // Code here can use x
	    System.out.println(x);

	}

}
