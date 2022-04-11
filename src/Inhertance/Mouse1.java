package Inhertance;


// The words extends means mouse1 class can use the code available in Mouse class
public class Mouse1 extends Mouse {
	public void bluetooth() {
		System.out.println("Mouse Connected!");
	}
	
	public static void main(String[] args) {
		Mouse1 m1 = new Mouse1();
		m1.leftClick();
		m1.bluetooth();
	}
}
