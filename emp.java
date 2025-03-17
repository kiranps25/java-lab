import java.util.*;
class emp
{
	Scanner s=new Scanner(System.in);
	int empid;
	double salary;
	String name,address;
	public emp(int empid,double salary,String name,String address)
	{
		this.empid=empid;
		this.salary=salary;
		this.name=name;
		this.address=address;
		
	}}
	class teacher extends emp
	{
		String department;
		String subject;
		public teacher(int empid,double salary,String name,String address,String department,String subject)
		{
			super(empid,salary,name,address);
			this.department=department;
			this.subject=subject;
		}
		void display()
		{
			System.out.println("empid: "+empid);
			System.out.println("name: "+name);
			System.out.println("salary: "+salary);
			System.out.println("address: "+address);
			System.out.println("department: "+department);
			System.out.println("subject: "+subject);
		}
		
		
	}
	

class Main
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of teacher: ");
		int N= s.nextInt();
		teacher tt[]=new teacher[N];
		for(int i = 0; i < N; i++)
		{

            		System.out.print("Empid: ");
            		int empid = s.nextInt();

            		System.out.print("Name: ");
            		String name = s.next();

            		System.out.print("Salary: ");
            		double salary = s.nextDouble();
            		

            		System.out.print("Address: ");
            		String address = s.next();

            		System.out.print("Department: ");
            		String department = s.next();
            		System.out.print("Subject: ");
            		String subject=s.next();
            		 tt[i]=new teacher(empid,salary,name,address,department,subject);
		}
		System.out.println("_________details of teachers_________");
		for(int i=0;i<N;i++)
		{
			tt[i].display();
		}
	}
}
