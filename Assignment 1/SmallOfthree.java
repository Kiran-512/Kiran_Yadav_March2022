import java.util.*;

class SmallOfthree
{
	 public static void main(String[] args) 
  {
     int sum=0,rem;
    
     Scanner sc = new Scanner(System.in);  
     System.out.println("Enter values for a b c: ");  
         int a,b,c;
        a = sc.nextInt(); 
        b = sc.nextInt();  
        c = sc.nextInt();  
        int large;
large = (a>b)?(a>c)?a:c:(b>c)?a:c;
     System.out.println(large);   
    if(a<b && a<c) 
	System.out.println(" a is small");
    else {if(b<c)
	System.out.println("b is small"+sum);
    else
    System.out.println("c is small"+sum);
	} 
  }
}
