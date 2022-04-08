package Arrays;
public class LearnArrays {
		
	public static void main(String[] args) {
		
		String[] userNames = {"Urmish","Vinay", "Nikunj","Siddharth"};
		
		//Prints First element of an array.
		System.out.println(userNames[0] + "\n");
		
		//Changes array element at index of 2.
		userNames[2] = "Urmish";
		
		//using For-each loop to go through array.
		System.out.println("For-Each loop .......... \n");
		for(String i : userNames) {
			System.out.println(i);
		}
		
		//using For loop to go through array.
		System.out.println("For loop .......... \n");
		for(int i = 0; i < userNames.length ; i++) {
			System.out.println(userNames[i]);
		}
		
	}
}
