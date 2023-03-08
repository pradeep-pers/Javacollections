 package ArrayString;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="WELCOME";
		String rev="";
		System.out.println(" Print the String:" +str);
		
		int len=str.length();
		System.out.println("Print the Lenghth of the String:" +len);
		
		for(int i=len-1; i>=0; i--)
		{
			
			rev=rev+str.charAt(i);
		}
		 System.out.println(" Print the String in Reverse Order:" +rev);
	}
  
}
