package Methods;

public class JavaMethods {
  // a method should be whithin a class
	
	//void is used when method is not returning any value
	//Static is used to directly call the method without any object
	public static void printHello() {
		System.out.println("Hello");
	}
	
	//we can call methods in our main method
	public static void main(String[] args) {
		//Calling a method
		printHello();
	}
}
