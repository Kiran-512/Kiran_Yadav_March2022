import java.util.Scanner;
class Problem_25_2{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in Octal form");
		int x = sc.nextInt();
		int rem = 0;
		System.out.println("The number in decimal form is");
		
		while(x>0){
		rem = x%8;
		System.out.print(rem);
		x=x/8;
		}	
		
	}
	
}