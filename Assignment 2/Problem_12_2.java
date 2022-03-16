import java.util.Scanner;

public class Problem_12_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a, b, c, avg;
        System.out.println("Enter the three numbers :");
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();

        avg = (a + b + c) / 3;

        System.out.println("The average of the three numbers is " + avg);

    }
}
