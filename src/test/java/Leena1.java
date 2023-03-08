
public class Leena1 extends Leena {
	
	int a;
	int b;

	/*public Leena1(int a, int b)
	{
		this.a=a;
		this.b=b;
	}*/

	
	

	@Override
	void add() {
		
		
		int sum=a+b;
		System.out.println(" Print the sum:"+sum);
		
		
		
	}

	@Override
	void sub() {
		
		int sub=a-b;
		System.out.println(" Print the SUB:"+sub);
		
	}

	@Override
	void mul() {
		
		int mul=a*b;
		System.out.println(" Print the MUL:"+mul);
		
		
		
	}

	@Override
	void div() {
		
		int div=a/b;
		System.out.println(" Print the DIV:"+div);
		
	}

}
