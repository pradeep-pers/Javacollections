package ArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class SortingArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> num=new ArrayList<Integer>();
		
		num.add(100);
		num.add(90);
		num.add(120);
		num.add(10);
		num.add(15000);
		num.add(3);
		num.add(666);
		num.add(222);
		num.add(30);
		num.add(101);
		
		System.out.println("ArrayList before Sort:" +num);
				
				
			Collections.sort(num);
			num.addAll(num);
			
		
		System.out.println("ArrayList after Sort:" +num);
		}
		
		
}

