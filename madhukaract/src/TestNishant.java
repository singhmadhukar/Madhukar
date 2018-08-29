import java.util.Scanner;

public class TestNishant {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of original items");
		int n = sc.nextInt();
		String org_items[]=new String[n];
		double org_price[]=new double[n];
		
		System.out.println("Enter Origional Items :");
		for(int i=0;i<n;i++){
			
			org_items[i]=sc.next();
		}
		System.out.println("Enter Origional Price :");
		for(int i=0;i<n;i++){
			
			org_price[i]=sc.nextDouble();
		}

		System.out.println("Enter size of items to be checked");
		int p = sc.nextInt();
		String items[]=new String[p];
		double price[]=new double[p];
		System.out.println("Enter Items :");
		for(int i=0;i<p;i++){
			
			items[i]=sc.next();
		}
		System.out.println("Enter Price :");
		for(int i=0;i<p;i++){
			
			price[i]=sc.nextDouble();
		}
		int c=0;
		for(int i=0;i<n;i++){
			
			for(int j=0;j<p;j++){
				
				if(org_items[i].equals(items[j])){
					
					if(org_price[i]!=price[j]){
						c++;
					}
				}
			}
		}
		System.out.println(c);
		

	}


}
