package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListStringDuplicate {

	public static void main(String[] args) {
		
		ArrayList<String> str=new ArrayList<String>();
		str.add("JAVA");
		str.add("C");
		str.add("C++");
		str.add("JAVA");
		str.add("C");
		str.add("C++");
		System.out.println("Print the ArrayList:" +str);
		
		Set<String> Str1=new HashSet<String>();
		
		for(String strng:str)
		{
			Str1.add(strng);
			
		}
		System.out.println(" Please print the unique arrayList:"+Str1);

	}

}
