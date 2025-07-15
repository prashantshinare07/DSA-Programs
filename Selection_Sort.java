// Program for Selection Sort
package my_package;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("How many elements you want to enter:");
		int n=scanner.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter "+n+" elements:");
		for(int i=0; i<n; i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		//Selection Sort Logic
		for(int i=0; i<n-1; i++)
		{
			int minIndex=i;
			for(int j=i+1; j<n; j++)
			{
				if(arr[j]<arr[minIndex])
				{
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		
		//Print Sorted array
      System.out.print("Sorted Array:");
      for(int i=0; i<n; i++)
      {
      	System.out.print(arr[i]+" ");
      }
	  scanner.close();
	}
}
