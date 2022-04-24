package Test;


public class Tester {
	
	String userName;
	double cheqBalance = 0;

	public Tester(String user) {
		
		this.userName = user;
		
	}
	
	public double deposit(double amountDeposit) {
		
		 cheqBalance += amountDeposit;
		 return cheqBalance;
		
	}
	
	public static void main(String[] args) {
		
		Tester user1 = new Tester("Urmish");
		System.out.println(user1.deposit(100));
		
		
	}
	
}