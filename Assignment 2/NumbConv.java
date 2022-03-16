import java.util.Scanner;

class Num {
    int  num;

    void setNum(){
        System.out.println("Enter the Number to check it the various forms :");
        // System.out.println("Press 1 for decimal to binary");
        // System.out.println("Press 2 for decimal to octal");
        // System.out.println("Press 3 for decimal to hexadecimal");
        // System.out.println("Press 4 for binary to decimal");
        // System.out.println("Press 5 for octal to decimal");
        // System.out.println("Press 6 for hexadecimal to decimal");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
    }
    void decToBin(){ 
        int r;
        System.out.println("The number in binary form is ");
        while(num>0){
            r = num % 2;
            System.out.print(r);
            num = num /10;
        }
    }
    void decToOct(){
        
    }
    void decToHex(){
        
    }
    

}

public class NumbConv {

    public static void main(String[] args) {

    }

}
