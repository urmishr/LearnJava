package Methods;

public class MethodOverloading {
	//Multiple Methods can have same name with different parameters.
	
	public static int addition(int x,int y) {
		return x + y;
	}
	public static double addition(double x,double y) {
		return x + y;
	}
	
	public static void main(String[] args) {

		int sum1 = addition(2,4);
		double sum2  = addition(2.5 , 6.5);
		System.out.println(sum1);
		System.out.println(sum2);
		
		
	}

}
