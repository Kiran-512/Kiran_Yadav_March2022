import java.util.Scanner;

public class Problem_8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number ");
        num = sc.nextShort();
        int length = String.valueOf(num).length();
        // System.out.println(length);

        System.out.println("The digit for the number are ");
        for (int i = 0; i < length; i++) {
            int digit = num % 10;
            num = num / 10;
            System.out.println(digit);
        }
    }
}

/*
 * 
 * C:\CDAC\Assignments\Assignment 1>javac Problem_8_1.java
 * 
 * C:\CDAC\Assignments\Assignment 1>java Problem_8_1
 * Enter the number
 * 256
 * The digit for the number are
 * 6
 * 5
 * 2
 * 
 * C:\CDAC\Assignments\Assignment 1>
 */