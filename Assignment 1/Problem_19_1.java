import java.util.Scanner;

public class Problem_19_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number upto which you want to print the even Number's series ");
        int n = sc.nextInt();
        System.out.println("Below is the series");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }

}
/* 

C:\CDAC\Assignments\Assignment 1>javac Problem_19_1.java

C:\CDAC\Assignments\Assignment 1>java Problem_19_1
Enter Number upto which you want to print the even Number's series 
15
Below is the series
2 4 6 8 10 12 14
C:\CDAC\Assignments\Assignment 1>
*/