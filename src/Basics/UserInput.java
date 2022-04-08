package Basics;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		//Create scanner object
		Scanner userName = new Scanner(System.in); 
		Scanner age = new Scanner(System.in);
		System.out.println("Enter Username : ");
		
		//Will read the user Input
		String user = userName.nextLine();
		//Will take integer and store it to age variable.
		System.out.println("Enter Age : ");
		
		//Will read the user Input
		int userAge = age.nextInt();
		System.out.println("\nNew user created. \n" );
		System.out.println(("Name : " + "\"" + user + "\""));
		System.out.println(("Age : " + "\"" + userAge + "\""));
		
	}

}
