import java.util.Scanner;

	class Problem_21_2{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number in decimal : ");
		int x = sc.nextInt();
		String res = " ";
		System.out.print("The number in Octal form is 0");
		
		while(x>0){
		int r = x%8;
		res =   r+res; 
		x=x/8;	
		}	
		System.out.print(res);
		
	}
	
}