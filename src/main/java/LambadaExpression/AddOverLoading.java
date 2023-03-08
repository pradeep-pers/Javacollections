package LambadaExpression;

public class AddOverLoading {
	
	
	int a;
	int b;
	int c;
	public AddOverLoading( int a, int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void ADD()
	{
		int sum=a+b+c;
		System.out.println("Print the sum: "+sum);
	}
	public void ADD(int b)
	{
		int sum=a+b+c;
		System.out.println("Print the sum: "+sum);
	}
	public void ADD(int b, int c)
	{
		int sum=a+b+c;
		System.out.println("Print the sum: "+sum);
	}
	public void ADD(int b, int c, int a)
	{
		int sum=a+b+c;
		System.out.println("Print the sum: "+sum);
	}

	public static void main(String[] args) {
		
		AddOverLoading obj1=new AddOverLoading(10, 10, 10);
		obj1.ADD();
		obj1.ADD(50);
	    obj1.ADD(40, 60);
	    obj1.ADD(10, 10, 10);

	}

}
