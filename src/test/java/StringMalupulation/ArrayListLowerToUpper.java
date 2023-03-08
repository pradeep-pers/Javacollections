package StringMalupulation;

import java.util.ArrayList;

public class ArrayListLowerToUpper {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		String str="pradeep";
		ArrayList<String> str1= new ArrayList<String>();
		str1.add(str);
		for(String st: str1)
		{
			System.out.println(st);
			
			System.out.println(st.toUpperCase());
			System.out.println(st.charAt(0));
			System.out.println(st.isEmpty());
			System.out.println(st.lastIndexOf("p"));
			System.out.println(st.contains(str));
			
			
			for (int i=0; i<str1.size(); i++)
			{
				for( int j=i+1; j<str1.size(); j++)
				{
					//if (st.get(i).contains(st.get(j))
					if(str1.get(i).contains(str1.get(j)))
					{
						int count=0;
						count=count+1;
						System.out.println("Print the conatians element:"+str1.get(i));
						System.out.println("Print the duplicate:" +count);
					}
				}
			}
		}
	}

}
