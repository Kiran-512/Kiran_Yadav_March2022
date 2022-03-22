import java.util.Scanner;

class FactorialRecursion
 {

    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
		
        
        long factorial = fact(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long fact(int num)
    {
        if (num >= 1)
            return num * fact(num - 1);
        else
            return 1;
    }
}
