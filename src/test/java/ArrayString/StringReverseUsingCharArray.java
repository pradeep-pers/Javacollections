package ArrayString;

public class StringReverseUsingCharArray {

	public static void main(String[] args) {
		String str="ABCDEF";
		char str1[]=str.toCharArray();
		String rev="";
		int n=str1.length;
		
		System.out.println(" Print the String:"+str);
		System.out.println(" Print length of the CharArray:"+n);
		
		for(int i=n-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(" Print the  Reverse String:"+rev); 
	}

}
