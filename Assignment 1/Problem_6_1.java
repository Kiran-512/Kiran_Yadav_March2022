import java.util.Scanner;

class Problem_6_1 {
	public static void main(String args[]) {
		System.out.println("Enter the year to check if it's leap or not");

		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		boolean leapyear;

		leapyear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

		if (leapyear)
			System.out.println("This is a leap year");
		else
			System.out.println("This is not a leap year");

	}
}

/*
 * 
 * To determine whether a year is a leap year, follow these steps:
 * 
 * If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
 * If the year is evenly divisible by 100, go to step 3. Otherwise, go to step
 * 4.
 * If the year is evenly divisible by 400, go to step 4. Otherwise, go to step
 * 5.
 * The year is a leap year (it has 366 days).
 * The year is not a leap year (it has 365 days).
 * 
 * 
 */