import java.util.Scanner;

public class Problem_5_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("The product of %d and %d is %d", a, b, a * b);
    }

}

// C:\CDAC\Assignments\Assignment 2>javac Problem_5_2.java

// C:\CDAC\Assignments\Assignment 2>java Problem_5_2
// Enter Two Numbers
// 10
// 58
// The product of 10 and 58 is 580
// C:\CDAC\Assignments\Assignment 2>