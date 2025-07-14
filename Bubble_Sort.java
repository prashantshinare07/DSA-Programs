//Program for bubble sort
package my_package;

import java.util.Scanner;

public class Bubble_Sort {

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
		
		//Bubble Sort Logic
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
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
