import java.util.*;

public class Problem_15_2 {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        a = scan.nextInt();
        b = scan.nextInt();
        temp = a;
        a=b;
        b=temp;
        System.out.println("After swaping the values aof a and b are  " + a + " "+ b);

    }
}
