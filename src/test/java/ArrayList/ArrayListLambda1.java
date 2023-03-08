package ArrayList;

import java.util.ArrayList;

public class ArrayListLambda1 {

	public static void main(String[] args) {
		
		String str ="welcome";
		
		ArrayList<String> str1=new ArrayList<String>();
		
		str1.add(str);
		
		System.out.println(" Print the arrayList:"+str1);
		
				System.out.println(" ArrayList Using Lambada Expression");
		
		str1.forEach((e) -> {
	      
	         System.out.print(e );
	      });
		

	}

}
