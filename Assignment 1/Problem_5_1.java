import java.util.Scanner;

class Problem_5_1 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it's positive r Negative");

		int a = sc.nextInt();

		String res = (a > 0) ? " Positive" : " Negative";

		System.out.println("Enter Numer is " + res);

	}
}

/*
 * C:\CDAC\Assignments\Assignment 1>java Problem_5_1
 * Enter the number to check whether it's positive r Negative
 * 15
 * Enter Numer is Positive
 * 
 * C:\CDAC\Assignments\Assignment 1>java Problem_5_1
 * Enter the number to check whether it's positive r Negative
 * 0
 * Enter Numer is Negative
 * 
 * C:\CDAC\Assignments\Assignment 1>java Problem_5_1
 * 
 * THIS IS NOT APPLICABLE FOR 0
 * 
 */