package ArrayString;

public class CharterOccurances {

	public static void main(String[] args) {
		
		String str="aaaggggghhhhjjjjyyyyfsgssfgsssgsg";
		char a[]=str.toCharArray();
		
		int[] arr=new int[5555555];
		int len=str.length();
		
		System.out.println("Length of the string:"+len);
		
		for(int i=0; i<str.length(); i++)
		{
			
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
			
		}
		int max=-1;
		char c=' ';
		for(int i=0; i<str.length(); i++)
		{
			if(max<arr[str.charAt(i)])
			{
				max=arr[str.charAt(i)];
				c=str.charAt(i);
			}
		}
		System.out.println("Maximum repeted charater is:" +c);

	}

}
