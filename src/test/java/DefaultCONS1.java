
public class DefaultCONS1 {
	
	int  age;
	String Name;
	String Address;
	
	public void  Display()
	
	{
		System.out.println(" Print the Age:"+age);
		System.out.println(" Print the Name:"+Name);
		System.out.println(" Print the address:"+Address);
		
	}
	
	
	

	public static void main(String[] args) {
		
		DefaultCONS1 s1=new DefaultCONS1();
		s1.age=10;
		s1.Name="bahhahh";
		s1.Address="201-hjsdhdhsdjjhdsjhjh"; 
		s1.Display();
		
		

	}

}
