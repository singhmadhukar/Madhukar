package pack1;

import java.util.Scanner;

public class GetPrimeUpTo_N {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Up to which prime no. to be printed :");
		
		int p = sc.nextInt();
	
		for( int n=2;n<=p;n++)
		{
			if(checkPrime(n)){			
				System.out.print(n+",");
			}
		}
	}
	static boolean checkPrime(int n){
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
				
			}			
		}
		return true;
	}

}
