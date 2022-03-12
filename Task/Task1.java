import java.util.Scanner;

class Task1{
	
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
	
	void deduct(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total working day's in a month ");
		int n = sc.nextInt();
		float h = 0f;
		int total = 0; 
		
		for(int i=1; i<=n;i++){
		System.out.println("Enter the no of hour for which employee worked per day for the day " + i);
		h = sc.nextFloat();
		if(h>=8)
			continue;
		total = total + 1;
	}
		
		double netsal = this.salary - 100*total;
		System.out.println("The net salary after deduction is " + netsal);
	
	}
	
	public static void main(String [] args){
		
		Task1 e1 = new Task1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details for the first employee, ID and Name viz ");
		int id = sc.nextInt();
		String name = sc.next();
		
	
		e1.setdata(id,name);
		e1.salary(10000);
		e1.getdata();
		e1.deduct();
	
	}	
}

/* 


C:\CDAC\Module 1\Day 4>javac Task1.java

C:\CDAC\Module 1\Day 4>java Task1
Enter the details for the first employee, ID and Name viz
101
Kiran
Gross salary of this employee is 11700.0
Emp id is 101
Emp name is Kiran
Emp branch is Accounts
Enter the total working day's in a month
5
Enter the no of hour for which employee worked per day for the day1
8
Enter the no of hour for which employee worked per day for the day2
8
Enter the no of hour for which employee worked per day for the day3
7
Enter the no of hour for which employee worked per day for the day4
6
Enter the no of hour for which employee worked per day for the day5
9
The net salary after deduction is 11500.0

C:\CDAC\Module 1\Day 4>

*/

/*

C:\CDAC\Module 1\Day 4>javac Task1.java

C:\CDAC\Module 1\Day 4>java Task1
Enter the details for the first employee, ID and Name viz
101
Kiran
Gross salary of this employee is 11700.0
Emp id is 101
Emp name is Kiran
Emp branch is Accounts
Enter the total working day's in a month
6
Enter the no of hour for which employee worked per day for the day 1
8
Enter the no of hour for which employee worked per day for the day 2
7
Enter the no of hour for which employee worked per day for the day 3
6
Enter the no of hour for which employee worked per day for the day 4
5
Enter the no of hour for which employee worked per day for the day 5
4
Enter the no of hour for which employee worked per day for the day 6
3
The net salary after deduction is 11200.0

C:\CDAC\Module 1\Day 4>

*/