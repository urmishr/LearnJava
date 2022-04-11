package Abstraction;

//Abstract class cant create objects
abstract class Animal {
	//abstract methods dont have any BODY(code inside).It will be declared later.
	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("Zzz");
	}

}
