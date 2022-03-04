import java.util.Scanner;

public class Problem_10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number ");
        num = sc.nextShort();
        int length = String.valueOf(num).length();
        // System.out.println(length);
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int digit = num % 10;
            num = num / 10;
            sum = digit + sum;
        }
        System.out.println("the total sum of all the digits is " + sum);

    }
}

/*
 * 
 * C:\CDAC\Assignments\Assignment 1>java Problem_10_1
 * Enter the number
 * 256
 * The digit for the number are
 * the total sum of all the digits is 13
 * 
 * C:\CDAC\Assignments\Assignment 1>
 */