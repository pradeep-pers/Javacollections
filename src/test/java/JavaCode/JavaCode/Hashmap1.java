package JavaCode.JavaCode;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		 
		map.put("gabu", 1);
		
		map.put("gabu", 1);
		map.put("tabu", 2);
		map.put("pabana", 3);
		map.put("Badap", 4);
		map.put("chota", 5);
		System.out.println("Print the Map:" +map);
		System.out.println("Map size:" +map.size());

	}
	 
}
