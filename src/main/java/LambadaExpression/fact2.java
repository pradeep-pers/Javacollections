package LambadaExpression;

import java.util.Scanner;

public class fact2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter any number: ");

		    // This method reads the number provided using keyboard
		    int num = sc.nextInt();

		    // Closing Scanner after the use
		    sc.close();

		    // Displaying the number
		    System.out.println("The number entered by user: "+num);

		
		int fact=1;
		int sum=0;
		
		System.out.println("--------------Print the Sum of factorial---------");
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
			
			sum=sum+fact;
			System.out.println(" prinrt the sum of fact:"+sum);
		}
		System.out.println("-----------Print the fact of NUM------------");
		System.out.println(" Print the fact:"+fact);
	}

}
 