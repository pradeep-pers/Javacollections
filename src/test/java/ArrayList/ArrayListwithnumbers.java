package ArrayList;

import java.util.ArrayList;

public class ArrayListwithnumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> num1= new ArrayList<Integer>();
		
		num1.add(10);
		num1.add(20);
		num1.add(30);
		System.out.println("Print the ArrayList num1:" +num1);
		
   ArrayList<Integer> num2= new ArrayList<Integer>();
   
   num2.add(1);
   num2.add(2);
   num2.add(3);
   
   System.out.println("Print the ArrayList num1:" +num2);
   
   
   if(num1.equals(num2))
   {
	   System.out.println(" Array List are Euqal");
   }
	   else
	   {
		   System.out.println(" Array List are  not Euqal");
	   }
   }
	}

 
