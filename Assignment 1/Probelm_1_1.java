import java.util.Scanner;

class Problem_1_1
{
	public static void main(String args[])
	{
	System.out.println("Enter the Number to check if it's EVEN or ODD");
	Scanner sc = new Scanner(System.in);
	
	float num = sc.nextFloat();
	String res = (num%2==0)?"Even":"Odd";
	
	System.out.println("Entered Number is " +res);	
	
}		
}