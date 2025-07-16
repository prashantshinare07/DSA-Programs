// Program for Insertion Sort
package my_package;

import java.util.Scanner;

public class Insertion_Sort {

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
		
		//Insertion Sort Logic
		for(int i=0; i<n-1; i++)
		{
			int key=arr[i];
			int j= i-1;
			while(j>=0 && arr[j]>key)
			{
			 arr[j+1]=arr[j];
			 j--;
			}
			arr[j+1]=key;
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

