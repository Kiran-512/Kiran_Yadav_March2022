import java.util.Scanner;

public class Problem_9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to get the factors ");

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int fact = num / i;
            if (num % i != 0)
                continue;
            System.out.println(fact);
            if (fact == 1)
                break;
        }

    }
}

/*
 
 * C:\CDAC\Assignments\Assignment 1>javac Problem_9_1.java
 * 
 * C:\CDAC\Assignments\Assignment 1>java Problem_9_1
 * Enter the Number to get the factors
 * 50
 * 50
 * 25
 * 10
 * 5
 * 2
 * 1
 * 
 * C:\CDAC\Assignments\Assignment 1>
 */