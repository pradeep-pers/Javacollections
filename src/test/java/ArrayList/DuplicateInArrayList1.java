package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateInArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(2);
		num.add(5);
		num.add(7);
		num.add(8);
		num.add(4);
		num.add(2);
		num.add(5);
		num.add(10);
		num.add(6);
		num.add(60);
		num.add(30);
		System.out.println("Print the Orginal ArrayList:"+num);
		
		Collections.sort(num);
		System.out.println("Print ArrayList after Sorting:"+num);
		int i=0;
		Collections.frequency(num, i);
		
		System.out.println("Print ArrayList With Frequency:"+num);
		
		Set<Integer> num1= new HashSet<Integer>();
		
		
		for(Integer number: num)
		{
			if(num1.add(number)==false);
			{
				{
					System.out.println(" Duplicate Elements is:"+number);    
				}
			}
			
		}
		System.out.println(" Print the ArrayList Using HashSet:" +num1);
	}

}
