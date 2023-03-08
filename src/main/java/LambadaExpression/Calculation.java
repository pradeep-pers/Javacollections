package LambadaExpression;

public class Calculation implements math  {

	@Override
	public void add() {
		
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(" Print the Sum of two numbers:"+sum);
		
	}

	@Override
	public void sub() {
		int a=10;
		int b=20;
		int sub=b-a;
		System.out.println(" Print the Sub of two numbers:"+sub);
		
	}

	@Override
	public void mul() {
		int a=99;
		int b=20;
		int mul=a*b;
		System.out.println(" Print the mul of two numbers:"+mul);
		
		
	}

	@Override
	public void div() {
		int a=89;
		int b=5;
		int div=a*b;
		System.out.println(" Print the div of two numbers:"+div);
		
		
	}
public static void main(String[] args) {
	
		
	Calculation x=new Calculation();
	x.add();
	x.sub();
	x.mul();
	x.div();
		
		
	}

}
  