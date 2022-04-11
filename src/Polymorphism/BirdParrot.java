package Polymorphism;

public class BirdParrot extends Bird {
		
	//we have created a parrot class which knows how to sing but it sounds different.
	public void sing() {
			System.out.println("squawk squawk");
		}
		
		public static void main(String[] args) {
			
			
			BirdParrot parrot = new BirdParrot();
			parrot.sing(); // even though we are using sing method it prints out from birdParrot but not from the Bird class.
		}
}

//polymorphism means that many form 
// a bird can sing but it have many form.