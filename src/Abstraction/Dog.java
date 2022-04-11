package Abstraction;

public class Dog extends Animal {
	public void animalSound() {
		System.out.println("Woof Woof!");
	}
	

	public static void main(String[] args) {
		
		Dog huskey = new Dog();
		huskey.animalSound();
		huskey.sleep();
		
	}

}
