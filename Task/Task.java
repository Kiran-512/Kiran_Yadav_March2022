import java.util.Scanner;

class Task{
	
	int id;
	String name;
	double salary;
	static String branch_id = "Accounts";
	
	void setdata(int emp_id, String emp_name){
		
		this.id = emp_id; 
		this.name = emp_name;
		
	}
	void salary(double base_sal){
		
		this.salary = base_sal + base_sal*0.07 + base_sal*0.1;
		System.out.println("Gross salary of this employee is " + this.salary);
	}
	
	void getdata(){
		System.out.println("Emp id is " + id);
		System.out.println("Emp name is " + name);
		System.out.println("Emp branch is " + branch_id);
	
	}
	
	public static void main(String [] args){
		
		Task e1 = new Task();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details for the first employee, ID and Name viz ");
		int id = sc.nextInt();
		String name = sc.next();
		
		e1.setdata(id,name);
		e1.salary(10000);
		e1.getdata();

	
		Task e2 = new Task();		
		e2.setdata(102,"Akshay Navale");
		e2.getdata();
		e2.salary(10000);
		
		Task e3 = new Task();
		e3.setdata(103,"Pranit Jagtap");
		branch_id = "Transports";
		e3.getdata();
		e3.salary(10000);
		
		Task e4 = new Task();		
		e4.getdata();
		e4.salary(10000);		
	}	
}