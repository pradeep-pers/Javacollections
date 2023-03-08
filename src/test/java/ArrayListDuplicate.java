import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDuplicate {
	
	

	public static void main(String[] args) {
		
		String str="pradeep";
		
		ArrayList<String> str1= new ArrayList<String>();
		
		str1.add(str);
		System.out.println("Print the String in arraylist:"+ str1);
		System.out.println("Print the String:"+ str);
		System.out.println("With Dulplicate elements:"+str1);
		
		//Collections.frequency(str1);
		Collections.reverse(str1);
		
		System.out.println("Print the frequency:"+str1.toString());
		System.out.println("Print the reversese:"+str1.contains(str));
		
		for(int i=0; i<str1.size(); i++)
		{
			for (int j=i+1; j<str1.size(); j++)  
			{
				
				
				if(str1.get(i).contains(str1.get(j)))
						
				{
					
					
					System.out.println("Print the String str1:" +str1.get(i));

					System.out.println("Print the String str1:" +str1.get(j));
					str1.remove(j);
					j--;
				}
				

			}
		}
		System.out.println("After Removing dulicate element: "+str1);
		
	}

}
