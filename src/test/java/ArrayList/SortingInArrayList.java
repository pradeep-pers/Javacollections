package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingInArrayList {

	private static Integer element;

	public static void main(String[] args) {
	
		ArrayList<Integer>num= new ArrayList<Integer>();
		
		num.add(10);
		num.add(8);
		num.add(20);
		num.add(30);
		num.add(2);
		num.add(25); 
		System.out.println("Print the Defined ArrayList:"+num);
		
		int n=num.size();
		System.out.println("Arralist size:" +n);
		Collections.sort(num);
		
		System.out.println("Array Is on sorted order:"+num);
		
	
	}
}