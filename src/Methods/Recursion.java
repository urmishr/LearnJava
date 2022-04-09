package Methods;

public class Recursion {

	public static int sum(int k) {
	    
		// Halting Condition.
		//  the halting condition is when the parameter k becomes 0.Otherwise loop will continue till infinite.
		
		if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	  }
	
	public static void main(String[] args) {
		
		// Recursion is the technique of making a function call itself. 
		// Adding two numbers together is easy to do, but adding a range of numbers is more complicated.
		// add a range of numbers together.
		int result = sum(10);
	    System.out.println(result);
		
	}

}
