package JavaCode.JavaCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist2 {
	
public static void main(String[] args) {
		
		ArrayList<String > num=new ArrayList<String>();
		
		num.add("10");
		num.add("2");
		num.add("35");
		
		System.out.println("Print My ArrayList:"+num);
		
       Collections.sort(num);
       
       System.out.println("List after Sort" + "Collections.sort() :\n" +num);
       
       Collections.reverse(num);
       for (String str:num)   
		{
			System.out.println(str);
		}
		
     

}
}   


