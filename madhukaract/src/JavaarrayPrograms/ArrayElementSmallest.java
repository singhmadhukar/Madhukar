package JavaarrayPrograms;

import java.util.Scanner;

public class ArrayElementSmallest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no. of element in array:");
		int n=sc.nextInt();
		int a[]= new int[n];
		
		System.out.println("Enter Elements in Array");
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		int min = a[0];
		for(int i=0;i<n;i++){
			if(min<a[i]){
				min=a[i];
				
			}
		}
		System.out.println(min);
		}

	}


