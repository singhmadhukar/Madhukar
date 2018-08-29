/*
	import javax.swing.*;
	import java.awt.event.*;
	 
	 
	class Calc implements ActionListener
	{
	    JFrame f;
	    JTextField t;
	    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,bdec,beq,bdel,bclr;
	 
	    static double a=0,b=0,result=0;
	    static int operator=0;
	 
	    Calc()
	    {
	        f=new JFrame("Calculator");
	        t=new JTextField();
	        b1=new JButton("1");
	        b2=new JButton("2");
	        b3=new JButton("3");
	        b4=new JButton("4");
	        b5=new JButton("5");
	        b6=new JButton("6");
	        b7=new JButton("7");
	        b8=new JButton("8");
	        b9=new JButton("9");
	        b0=new JButton("0");
	        bdiv=new JButton("/");
	        bmul=new JButton("*");
	        bsub=new JButton("-");
	        badd=new JButton("+");
	        bdec=new JButton(".");
	        beq=new JButton("=");
	        bdel=new JButton("Delete");
	        bclr=new JButton("Clear");
	        
	        t.setBounds(30,40,280,30);
	        b7.setBounds(40,100,50,40);
	        b8.setBounds(110,100,50,40);
	        b9.setBounds(180,100,50,40);
	        bdiv.setBounds(250,100,50,40);
	        
	        b4.setBounds(40,170,50,40);
	        b5.setBounds(110,170,50,40);
	        b6.setBounds(180,170,50,40);
	        bmul.setBounds(250,170,50,40);
	        
	        b1.setBounds(40,240,50,40);
	        b2.setBounds(110,240,50,40);
	        b3.setBounds(180,240,50,40);
	        bsub.setBounds(250,240,50,40);
	        
	        bdec.setBounds(40,310,50,40);
	        b0.setBounds(110,310,50,40);
	        beq.setBounds(180,310,50,40);
	        badd.setBounds(250,310,50,40);
	        
	        bdel.setBounds(60,380,100,40);
	        bclr.setBounds(180,380,100,40);
	        
	        f.add(t);
	        f.add(b7);
	        f.add(b8);
	        f.add(b9);
	        f.add(bdiv);
	        f.add(b4);
	        f.add(b5);
	        f.add(b6);
	        f.add(bmul);
	        f.add(b1);
	        f.add(b2);
	        f.add(b3);
	        f.add(bsub);
	        f.add(bdec);
	        f.add(b0);
	        f.add(beq);
	        f.add(badd);
	        f.add(bdel);
	        f.add(bclr);
	        
	        f.setLayout(null);
	        f.setVisible(true);
	        f.setSize(350,500);
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.setResizable(false);
	        
	        b1.addActionListener(this);
	        b2.addActionListener(this);
	        b3.addActionListener(this);
	        b4.addActionListener(this);
	        b5.addActionListener(this);
	        b6.addActionListener(this);
	        b7.addActionListener(this);
	        b8.addActionListener(this);
	        b9.addActionListener(this);
	        b0.addActionListener(this);
	        badd.addActionListener(this);
	        bdiv.addActionListener(this);
	        bmul.addActionListener(this);
	        bsub.addActionListener(this);
	        bdec.addActionListener(this);
	        beq.addActionListener(this);
	        bdel.addActionListener(this);
	        bclr.addActionListener(this);
	    }
	 
	    public void actionPerformed(ActionEvent e)
	    {
	        if(e.getSource()==b1)
	            t.setText(t.getText().concat("1"));
	        
	        if(e.getSource()==b2)
	            t.setText(t.getText().concat("2"));
	        
	        if(e.getSource()==b3)
	            t.setText(t.getText().concat("3"));
	        
	        if(e.getSource()==b4)
	            t.setText(t.getText().concat("4"));
	        
	        if(e.getSource()==b5)
	            t.setText(t.getText().concat("5"));
	        
	        if(e.getSource()==b6)
	            t.setText(t.getText().concat("6"));
	        
	        if(e.getSource()==b7)
	            t.setText(t.getText().concat("7"));
	        
	        if(e.getSource()==b8)
	            t.setText(t.getText().concat("8"));
	        
	        if(e.getSource()==b9)
	            t.setText(t.getText().concat("9"));
	        
	        if(e.getSource()==b0)
	            t.setText(t.getText().concat("0"));
	        
	        if(e.getSource()==bdec)
	            t.setText(t.getText().concat("."));
	        
	        if(e.getSource()==badd)
	        {
	            a=Double.parseDouble(t.getText());
	            operator=1;
	            t.setText("");
	        } 
	        
	        if(e.getSource()==bsub)
	        {
	            a=Double.parseDouble(t.getText());
	            operator=2;
	            t.setText("");
	        }
	        
	        if(e.getSource()==bmul)
	        {
	            a=Double.parseDouble(t.getText());
	            operator=3;
	            t.setText("");
	        }
	        
	        if(e.getSource()==bdiv)
	        {
	            a=Double.parseDouble(t.getText());
	            operator=4;
	            t.setText("");
	        }
	        
	        if(e.getSource()==beq)
	        {
	            b=Double.parseDouble(t.getText());
	        
	            switch(operator)
	            {
	                case 1: result=a+b;
	                    break;
	        
	                case 2: result=a-b;
	                    break;
	        
	                case 3: result=a*b;
	                    break;
	        
	                case 4: result=a/b;
	                    break;
	        
	                default: result=0;
	            }
	        
	            t.setText(""+result);
	        }
	        
	        if(e.getSource()==bclr)
	            t.setText("");
	        
	        if(e.getSource()==bdel)
	        {
	            String s=t.getText();
	            t.setText("");
	            for(int i=0;i<s.length()-1;i++)
	            t.setText(t.getText()+s.charAt(i));
	        }        
	    }
	 
	    public static void main(String...s)
	    {
	        new Calc();
	    }
	}*/
/*public class Test {

    public static void main(String[] args) {

        String input = new String("abbc");
        String output = new String();

        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < output.length(); j++) {
                if (input.charAt(i) != output.charAt(j)) {
                    output = output + input.charAt(i);
                }
            }
        }

        System.out.println(output);

    }

}





public class DuplicatesInArray 
{   
    public static void main(String[] args) 
    {
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
 
        for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
        }
    }    
}
Output :
public class SecondLargestInArrayExample{  
public static int getSecondLargest(int[] a, int total){  
int temp;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i]>a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-1];  
}  
public static void main(String args[]){  
//int a[]={1,2,5,6,3,2};  
int b[]={44,66,99,77,33,22,55};  
//System.out.println("Second Largest: "+getSecondLargest(a,6));  
System.out.println("Second Largest: "+getSecondLargest(b,7));  
}}  
	 

public class  SecondLargestInArrayExample {
	   public static void main(String[] args) {
	      int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	      System.out.println("Array before reverse:");
	      
	      for (int i = 0; i < numbers.length; i++) {
	         System.out.print(numbers[i] + " ");
	      } 
	      for (int i = 0; i < numbers.length / 2; i++) {
	         int temp = numbers[i];
	         numbers[i] = numbers[numbers.length - 1 - i];
	         numbers[numbers.length - 1 - i] = temp;
	      } 
	      System.out.println("\nArray after reverse:");
	      for (int i = 0; i < numbers.length; i++) {
	         System.out.print(numbers[i] + " ");
	      } 
	   }
	}
public class Hello {
    public static void main(String[] args) {
        String str1 = "zeep";
        System.out.println(removeDuplicateChars(str1));
        String str2 = "hello";
        System.out.println(removeDuplicateChars(str2));
    }
 
    public static String removeDuplicateChars(String sourceStr) {
        // Store encountered letters in this string.
        char[] chrArray = sourceStr.toCharArray();
        String targetStr = "";
 
        // Loop over each character.
        for (char value : chrArray) {
            // See if character is in the target
            if (targetStr.indexOf(value) == -1) {
                targetStr += value; // Use StringBuilder as shown below
            }
        }
        return targetStr;
    }
}

public class Count {

    public static void main(String[] args) {
        String line = "This website is aw3som3.";
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
            else if (ch ==' ')
            {
                ++spaces;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);
    }

*/
public class Count {

    public static void main(String[] args) {
	 String s1="java Developer" ;
	 String s2="";
	 String s3="";
	 for(int i=0;i<=s1.length()-1;i++)
	 {
		 int count=0;
		 for(int j=0;j<=s2.length()-1;j++)
		 {
			 if(s1.charAt(i)==s2.charAt(j))
			 {
			count++;
			break;
			 }
		 }
			 if(count==0)
			 {
				 s3=s3+s1.charAt(i);
		 		  break;
			 }
			 if(count==0)
			 {
				 s2+=s1.charAt(i);
			 }
			 
	 }
		 
		 
	 System.out.println(s3);
  }
}
    

 


