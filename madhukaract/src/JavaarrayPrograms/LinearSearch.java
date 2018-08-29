package JavaarrayPrograms;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();

		int arr[]=new int[p];

		System.out.println("Enter the Elements in array");
		for(int i=0;i<p;i++)
		{
			arr[i]=sc.nextInt();

		}		
		System.out.println("Enter no to be searched");
		int ele=sc.nextInt();		

		boolean flag = false;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]==ele)
			{
				flag= true;
				break;

			}

		}

		if(flag)System.out.println("Present");		
		else{System.out.println("Not Present");

		}

	}	

}


