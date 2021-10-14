package HASHMAP;

import java.util.HashMap;
import java.util.Map;

public class HASHMAP {
	public static void main(String[]args) {
		Map<Integer,String> Namemap = new HashMap<>();
		
		Namemap.put(1,"sanjay");
		Namemap.put(2,"ashutosh");
		Namemap.put(3,"nipun");
		Namemap.put(4,"rabish");
		Namemap.put(5,"akansha");
		keysetName (Namemap);
		

			
		}
		
	

	public static void keysetName(Map<Integer,String> Namemap) {
		// TODO Auto-generated method stub
		
		for (Integer ID: Namemap.keySet()) {
			System.out.println("key value="+ID);
			System.out.println("NAME="+ Namemap.get(ID));
			
			
		
			
		}
		
	}

}
