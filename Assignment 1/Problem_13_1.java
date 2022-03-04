import java.util.Scanner;

public class Problem_13_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number ");
        num = sc.nextInt();
        int length = String.valueOf(num).length();
        System.out.print("Entered number is reverse format is ");
        for (int i = 0; i < length; i++) {
            int digit = num % 10;
            num = num / 10;
            System.out.print(digit);
        }
    }
}

/*
C:\CDAC\Assignments\Assignment 1>javac Problem_13_1.java

C:\CDAC\Assignments\Assignment 1>java Problem_13_1
Enter the number
12546
Entered number is reverse format is 64521
C:\CDAC\Assignments\Assignment 1>
*/