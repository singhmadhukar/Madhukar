package Assignment;
import java.util.Scanner;
class StringSwap
{
	public static void main(String[] args) {
		
		
		String a=System.getProperty("user.dir");
		System.out.println(a);
		  String str="java";
		  int count=0,len=0,flag=0;
		 
		  len=str.length();
		  
		  for(int i=0;i<len;i++)
		  {
		   count=0;
		   for(int k=0;k<i;k++)
		   {			   
		    if(str.charAt(k)==str.charAt(i))
		    {
		    	flag = 1;
		    }
		   }
		   if(flag!=1){
		   for(int j=0;j<len;j++)
		   {
		    if(str.charAt(j)==str.charAt(i))
		    {
		     count++;
		    }
		   }  
		    
		    System.out.println(str.charAt(i)+":"+count+"\n");
		   }
		   flag=0;
		  }
		 }
}
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String str="I love My Country";
		/*String []arr=str.split(" ");
		String Empty=" ";
		Empty +=arr[arr.length-1];
		for (int i=1;i<=arr.length-2;i++)
		{
			Empty=Empty+arr[i]+" ";
			
		}
		Empty=Empty +arr[0];
		System.out.println(Empty+" ");*/
		
	/*	 int count = 0;
		char []arr=str.toCharArray();
		 for(int i=0;i<arr.length;i++)
		 {
			 
			 count++;
			 
		 }
	
		System.out.println(count);*/
		
		
	/*	int c=0,i=0;
		  //for(; ;)
		while(true)
		{
			try
			{
				char ch=str.charAt(i);
				i++;
			}
			catch(Exception e)
			{
				System.out.println("Length of string :"+i);
				break;
			}*/
		
		
		/*String str1="a b $ c d e = f g #";
		String st=" ";
		char []ch=str1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a')
			{
				ch[i]='g';
			}
			else if(ch[i]=='b')
			{
				ch[i]='f';
			}
			else if(ch[i]=='c')
			{
				ch[i]='e';
			}
			else if(ch[i]=='e')
			{
				ch[i]='c';
			}
			else if(ch[i]=='f')
			{
				ch[i]='b';
			}
			else if(ch[i]=='g')
			{
				ch[i]='a';
			}
			st+=ch[i];
		}
		System.err.println("Output Of given String: "+st);
		
		
		
		}

	}*/
	
	
	
	


