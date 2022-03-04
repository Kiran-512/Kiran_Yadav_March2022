import java.util.Scanner;

public class Problem_18_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to get the factors ");

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int fact = num / i;
            if (num % i != 0)
                continue;
            if (fact% i==0)
            System.out.println(fact);

        }

    }
}