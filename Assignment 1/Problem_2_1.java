import java.util.Scanner;

class Problem_2_1 {
	public static void main(String args[]) {
		System.out.println("Enter the Number to find it's factorial");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;
		}
		System.out.println("Factorial for the given Number is " + fact);

	}
}

/*
 * 
 * loop execution
 * for i= 1 - > fact = 1
 * for i= 2 - > fact = 2
 * for i= 3 - > fact = 6
 * 
 * 
 * C:\CDAC\Assignments\Assignment 1>java Problem_2_1
 * Enter the Number to find it's factorial
 * 3
 * Factorial for the given Number is 6
 * 
 * 
 */