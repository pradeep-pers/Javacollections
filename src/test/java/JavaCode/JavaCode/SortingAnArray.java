package JavaCode.JavaCode;

import java.util.Arrays;

public class SortingAnArray {

	public static void main(String[] args) {
		
		int a[]= {700,987,543,90342,76378,1,7090,5,1,3,5,4,48};
		System.out.println("Array before Sorting:" +Arrays.toString(a));
		int n=a.length;
		
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-1; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
					//temp1=a[j]
					//temp2=a[j+1]
					//temp1=temp2
					
				}
			}
		}
		System.out.println("Array after Sorting:" +Arrays.toString(a));

	}

}
