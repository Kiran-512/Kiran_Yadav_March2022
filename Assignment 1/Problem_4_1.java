import java.util.Scanner;

class Problem_4_1 {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of the first number");
		int x = sc.nextInt();

		System.out.println("Enter the value of the second number");
		int y = sc.nextInt();

		System.out.println("The values of Numbers before swaping are " + x + " and " + y);

		x = x + y; // x = 11 = 5 + 6
		y = x - y; // y = 11 - 6 = 5
		x = x - y; // x = 11 - 5 = 6

		System.out.println("The values of Numbers after swaping are " + x + " and " + y);

	}
}

/*
 * 
 * C:\CDAC\Assignments\Assignment 1>java Problem_4_1
 * Enter the value of the first number
 * 15
 * Enter the value of the second number
 * 20
 * The values of Numbers before swaping are 15 and 20
 * The values of Numbers after swaping are 20 and 15
 * 
 * C:\CDAC\Assignments\Assignment 1>
 * 
 */