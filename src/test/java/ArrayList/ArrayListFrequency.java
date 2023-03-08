package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFrequency {

	public static void main(String[] args) {
ArrayList<Integer> num=new ArrayList<Integer>();
		
		num.add(100);
		num.add(100);
		num.add(120);
		num.add(100);
		num.add(15000);
		num.add(100);
		num.add(666);
		num.add(222);
		num.add(30);
		num.add(101);
		
		System.out.println("ArrayList before Frquency:" +num);
				
		Collections.reverse(num);	
		System.out.println("Print the Reverse list:"+num);

		
		int freq = Collections.frequency(num, 100);

	      System.out.println("Frequency of 100 is: "+freq);    
		
		
		
		}
		


	}


