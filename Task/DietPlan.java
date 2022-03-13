import java.util.*;

class BmiCalc
{
	String name;
	String gender;
	double weight;
	double height;
	double age;
	
	BmiCalc()
	{
		System.out.println("       Welcome!!!");
		System.out.println("Enter the data height in m and weight in kgs : ");
	}
	
	BmiCalc(String name,String gender,double weight,double height,double age)
	{
//		this();
		setdata(name,gender,weight,height,age);
	}
	
	void setdata(String name,String gender,double weight,double height,double age)
	{
		this.name = name;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.age = age;
		
	}
	void getdata()
	{
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Weight : "+weight);
		System.out.println("Height : "+height);
		System.out.println("Age : "+age);
		
	}
	
	void calculatebmi()
	{
		double bmi = (weight/(height*height));
		System.out.println("BMI = "+bmi);
		checkbmi(bmi);
	}
	
	void checkbmi(double bmi)
	{
		if(bmi<=18.5)
			System.out.println("You are underweight");
		else if(bmi>18.5 && bmi<=25)
			System.out.println("You are Healthy");
		else
			System.out.println("You are overweight");
	}
	
}

class DietPlan{
		public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		BmiCalc d = new BmiCalc();
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your gender : ");
		String gender = sc.nextLine();
		System.out.println("Enter your weight in kgs : ");
		double weight = sc.nextDouble();
		System.out.println("Enter your height in meter : ");
		double height = sc.nextDouble();
		System.out.println("Enter your age : ");
		double age = sc.nextDouble();
		
		d.setdata(name,gender,weight,height,age);
		d.getdata();
		d.calculatebmi();
		
		
	}
	
}