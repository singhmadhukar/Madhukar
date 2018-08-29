import java.util.HashMap;
import java.util.Scanner;

public class Colljava {

	public static void main(String[] args) {

		//instantiation
		/*
		int []arg=new int[3];
		System.out.println(arg[0]);
		System.out.println(arg[1]);
		System.out.println(arg[2]);

		Initialization

		arg[0]=101;
		arg[1]=102;
		arg[2]=103;		
		System.out.println(arg[0]);
		System.out.println(arg[1]);
		System.out.println(arg[2]);*/

		/*int[]arg=new int[3];
		arg[0]=101;
		arg[1]=102;
		arg[2]=103;

		System.out.println("first index value is:"+arg[0]);
		System.out.println("Last index value is:"+arg[arg.length-1]);*/


		//program to create an array dynamically and insert the elements


		/*Scanner sc=new Scanner(System.in);
		//System.out.println("enter the size of an array");
		int[]arr=new int[sc.nextInt()];*/

		//print array with default values

		/*for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}



		//Add elements//Array Initialization

		System.out.println("Enter the elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}



		//print array
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		} */

		/*int i, a[];

		a = new int[args.length];
		for(i=0;i<args.length;i++){
			try{
				a[i] = Integer.parseInt(args[i]);
			}catch(Exception e){
				System.out.println("Enter only integral value as cmd line argument");
			}
		}

		
		for( int j=0;j<a.length;j++)
		{
			System.out.print(a[j]);
			System.out.print(j<a.length-1?",":" ");*/
		//PROGRAM TO FIND GIVEN ELEMENT IS PRESENT IN  AN INTEGER ARRAY

	/*	int []arr={20,40,59,90,80};
		int ele=96;
		 int flag=0;
		 for(int i=0;i<=arr.length-1;i++)
		 {
			 if(arr[i]==ele)
			 {
				 flag=1;
				 break;
			 }
		 }
		 if(flag==1)
		 {
			 System.out.println("present");
		 }
		  else
		 {
			System.out.println("Not present");
		 }*/
		
		
		// PROGRAM TO COUNT THE OCCURANCE OF CHARACTERS IN A GIVEN STRING
	    String str = "programming";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}
		 
		





