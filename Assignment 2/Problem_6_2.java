import java.util.Scanner;

public class Problem_6_2 {
public static void main(String[] args) {
    System.out.println("Enter Number to get the table ");
 Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for (int i =1; i <=10; i++) {
        int res = a*i;
         System.out.println(res);   
    }
}       
}
/*
C:\CDAC\Assignments\Assignment 2>javac Problem_6_2.java

C:\CDAC\Assignments\Assignment 2>java Problem_6_2
Enter Number to get the table
5
5
10
15
20
25
30
35
40
45
50

C:\CDAC\Assignments\Assignment 2>
*/