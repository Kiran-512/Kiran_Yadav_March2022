import java.util.Scanner;

	class Problem_19_2{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number in decimal : ");
		int x = sc.nextInt();
		String res = "";
		System.out.print("The number in Binary form is ");
		
		while(x>0){
		int r = x%2;
		res =   r+res; 
		x=x/8;	
		}	
		System.out.print(res);
		
	}
	
}