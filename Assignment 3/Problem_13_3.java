public class Problem_13_3 {

    public static void main(String[] args) {

        for (char i = 'A'; i <='E'; i++) {
            for (int j = 75; j > i + 5; j--) {
                System.out.print(" ");
            }
            for (int j = 'A'; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }

    }

}
