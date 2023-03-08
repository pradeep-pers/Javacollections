package ArrayList;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicateValue {

	public static void main(String[] args) {
		
		int arr[]= {2,2,3,6,7,6,7,8,9,8,9};
				
		Set<Integer>num=new HashSet<Integer>();
		
		for(Integer num1 :arr)
		{
			if(num.add(num1)==false)
			{
				System.out.println(" Dupilcate Numbers Are:" +num1);
			}
		}
     System.out.println(" Print the array Without Duplicate:" +num);
	}

}
