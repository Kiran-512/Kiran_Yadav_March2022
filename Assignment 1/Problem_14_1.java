import java.util.Scanner;

public class Problem_14_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, hcf = 1;
        System.out.println("Enter two Numbers ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int lenght = (num1 > num2) ? num1 : num2;
        for (int i = 1; i < lenght; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of both the number's is " + hcf);
    }
}

/*
C:\CDAC\Assignments\Assignment 1>java Problem_14_1
Enter two Numbers
15
105
HCF of both the number's is 15
 */
