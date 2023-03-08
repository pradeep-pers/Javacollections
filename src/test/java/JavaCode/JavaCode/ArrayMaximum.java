package JavaCode.JavaCode;

public class ArrayMaximum {

	public static void main(String[] args) {
		
		
		int a[]= {100,10,1,300,4,70,9000};
		
		int max=a[0];
		
		for(int i=1; i<a.length;i++)
		{
		
			if(a[i]>max)
			{
				max=a[i];
			}

}

		System.out.println("Maximum element in the array is:" +max);
}
}