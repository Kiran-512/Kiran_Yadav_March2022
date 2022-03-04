import java.util.Scanner;

public class Problem_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.println("Enter three numbers ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int res = (a < b) ? (a < c ? a : c) : (c < b ? c : b);
        System.out.println("The smallest of all the three numbers is " + res);
    }
}
/*
C:\CDAC\Assignments\Assignment 1>javac Problem_11_1.java

C:\CDAC\Assignments\Assignment 1>java Problem_11_1
Enter three numbers
10
20
30
The smallest of all the three numbers is 10

C:\CDAC\Assignments\Assignment 1>
*/