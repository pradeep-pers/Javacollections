package ArrayString;

public class CharDuplicate1 {

	public static void main(String[] args) {
		
		String str="aabbccdd";
		char a[]=str.toCharArray();
		
		boolean flag=false;
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(a[i]==a[j])
				{
					flag=true;
					count=count+1;
					System.out.println("Duplicate chars are found on string:" +a[i]);
					System.out.println(" Count of matches:"+count);
				}
				
		}

	}

	}
}
