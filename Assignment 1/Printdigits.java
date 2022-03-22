import java.util.Scanner;

class Printdigits
  
{  
	public static void main(String args[])  
	{  
		int n, i, temp, count=0;  
 
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter any number: ");  
         
        n = sc.nextInt();  
        
        temp=n;  
        while (temp>0)  
        {  
        count++; 
        temp = temp/10;  
        }
          
        
        double num = Math.pow(10, count-1);  
         
        i = (int)num;  
		
        for (;i>0;i/=10)  
        System.out.println(n/i%10);  
         
   }  
}  
	