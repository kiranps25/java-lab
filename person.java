import java.util.*;
class person
{
	Scanner s=new Scanner(System.in);
	String name,gender,address;
	int age;
	public person(String name,String gender,String address,int age)
	{
		this.name=name;
		this.gender=gender;
		this.address=address;
		this.age=age;
	}
}
class employee extends person
{
	String company,qualification;
	int salary,empid;
	public employee(String name,String gender,String address,int age,String company,String qualification,int salary,int empid)
	{
		super(name,gender,address,age);
		this.company=company;
		this.qualification=qualification;
		this.salary=salary;
		this.empid=empid;
	}
}
class teacher extends employee
{
	String subject,department;
	int teacherid;
	public teacher(String name,String gender,String address,int age,String company,String qualification,int salary,int empid,String subject,String department,int teacherid)
	{
		super(name,gender,address,age,company,qualification,salary,empid);
		this.subject=subject;
		this.department=department;
		this.teacherid=teacherid;
	}
	
	void display()
		{
			System.out.println("name: "+name);
			System.out.println("gender: "+gender);
			System.out.println("address: "+address);
			System.out.println("age: "+age);
			System.out.println("company: "+company);
			System.out.println("qualification: "+qualification);
			
			System.out.println("salary: "+salary);
			System.out.println("empid: "+empid);
			System.out.println("subject: "+subject);
			System.out.println("department: "+department);
			System.out.println("teacherid: "+teacherid);
		}
}
class Main
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
	System.out.println("enter the number of person: ");
	int N= s.nextInt();
	teacher tt[]=new teacher[N];
	for(int i=0;i<N;i++)
	{
		
		System.out.println("name: ");
		String name = s.next();
		System.out.println("gender: ");
		String gender = s.next();
		System.out.println("address: ");
		String address = s.next();
		System.out.println("age: ");
		int age = s.nextInt();
		System.out.println("company: ");
		String company = s.next();
		System.out.println("qualification: ");
		String qualification = s.next();
		System.out.println("salary: ");
		int salary = s.nextInt();
		System.out.println("empid: ");
		int empid = s.nextInt();
		System.out.println("subject: ");
		String subject = s.next();
		System.out.println("department: ");
		String department = s.next();
		System.out.println("teacherid: ");
		int teacherid = s.nextInt();
		tt[i]=new teacher(name,gender,address,age,company,qualification,salary,empid,subject,department,teacherid);
	}
	System.out.println("_________details of teachers_________");
	for(int i=0;i<N;i++)
	{
		tt[i].display();
	}
	}
}
