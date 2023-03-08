package JavaCode.JavaCode;

import java.util.ArrayList;
import java.util.Collections;


public class Test123 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		ArrayList<String > num=new ArrayList<String>();
		
		num.add("1");
		num.add("2");
		num.add("3");
		
		System.out.println("Print My ArrayList:"+num);
		
		Collections.reverse(num);
		
		for (String str:num)   
		{
			System.out.println(str);
		}
		
		

	}

}
