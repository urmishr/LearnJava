package Test;
import java.util.ArrayList;
import java.util.Scanner;
public class UserName {
	
	public static void main(String[] args) {
	Scanner user = new Scanner(System.in);
	
	
	ArrayList<String> saveNames = new ArrayList<String>();

	
	
	
	int i = 0;
	while (i >= 0) {
		System.out.println("Enter your name: \n(Use Keyword \'exit\' to end.)\n");
		String enteredUser = user.nextLine();
		if (enteredUser.equals("exit")) {
			break;
			
			
		} 
		
		saveNames.add(enteredUser);
		i++;
	}
	
	System.out.println("\nEntered Names: ");
	for(int j = 0; j < saveNames.size();j++) {
		System.out.println(saveNames.get(j));
	}
			
	
	}
}
