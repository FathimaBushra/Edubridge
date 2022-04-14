package practice_qns;

import java.util.Scanner;

public class Qn0702 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the first name : ");
		String fnam=scanner.nextLine();
		System.out.println("Enter the middle name : ");
		String mnam=scanner.nextLine();
		System.out.println("Enter the last name : ");
		String lnam=scanner.nextLine();
		System.out.println("Enter Contact: ");
		String contact=scanner.nextLine();
		System.out.println("Enter Department: ");
		String department=scanner.nextLine();
		System.out.println("Enter the basicPay : ");
		int baP=scanner.nextInt();
		System.out.println("Enter the entertainmentAllowance : ");
		int ent=scanner.nextInt();
		System.out.println("Enter the incentive : ");
		int incen=scanner.nextInt();
		
		Empname1 empn=new Empname1(fnam,mnam,lnam);
		Salar s=new Salar(baP,ent,incen);
		Empdetails1 emp=new Empdetails1(s,contact,department,empn);
		emp.display();	
		scanner.close();

	}

}
class Salar
{
	int basicPay;
	int entertainment;
	int incentive;
	public Salar(int basicPay,int entertainment,int incentive)
	{
		super();
		this.basicPay=basicPay;
		this.entertainment=entertainment;
		this.incentive=incentive;
	}
	
}
class Empname1
{
	String fname,mname,lname;
	public Empname1(String fname,String mname,String lname){
		super();
		this.fname=fname;
		this.mname=mname;
		this.lname=lname;
	}
}
class Empdetails1{
	Empname1 empname;
	String contact,department;
	Salar salary;
	public Empdetails1(Salar salary,String contact,String department,Empname1 empname) {
		super();
		this.salary = salary;
		this.empname = empname;
		this.contact=contact;
		this.department = department;
	}
	
	void display()
	{
		System.out.println("Name : ");
		System.out.println(empname.fname+" "+empname.mname+" "+empname.lname+" ");
		System.out.println("Contact : "+contact);
		System.out.println("Department: "+department);
		System.out.println("Salary is : ");
		System.out.print(salary.basicPay+salary.entertainment+salary.incentive);
	}
}