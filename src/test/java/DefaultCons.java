
public class DefaultCons {
	
	
	int a;
	int b;
	public void add()
	{
		int sum=a+b;
		System.out.println("Print the sum of two num:"+sum);
	}

	public static void main(String[] args) {
		DefaultCons obj1=new DefaultCons();
		obj1.add();
		
		DefaultCons obj2=new DefaultCons();
		obj2.a=20;
		obj2.b=30;
		obj2.add();
				

	}

}
