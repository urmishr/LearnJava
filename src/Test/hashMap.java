package Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class hashMap {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HashMap<String, Integer> user = new HashMap<String, Integer>();
			
			user.put("Urmish", 27);
			user.put("Vinay", 22);
			user.put("Nikunj", 26);
			
			
			
			for (int i : user.values()) {
				System.out.println(i);
			}
	}
	
	

}
