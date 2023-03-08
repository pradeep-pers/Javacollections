package ArrayString;

public class DplicateString1 {

	public static void main(String[] args) {
		
		String arr[]= {"JAVA","python","C++","C","Cobol","python"};
		
		
		
		boolean flag=false;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					flag=true;
					System.out.println(" Duplicate Elemenet:" +arr[i]);
				}
			}
		}
		if (flag==false)
		{
			System.out.println(" No Duplicate Elements are found in string Array");
		}
	}

}
