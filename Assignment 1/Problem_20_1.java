import java.util.Scanner;

public class Problem_20_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number upto which you want to print the odd series ");
        int n = sc.nextInt();
        System.out.println("Below is the series");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

    }

}
/*
 * C:\CDAC\Assignments\Assignment 1>java Problem_16_1
 * Enter Number upto which you want to print the odd series
 * 15
 * Below is the series
 * 1 3 5 7 9 11 13 15
 * C:\CDAC\Assignments\Assignment 1>
 */