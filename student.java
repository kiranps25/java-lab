import java.util.*;
class student
{
	int[] mark=new int[5];
	String name;
	int roll;
	Scanner n=new Scanner(System.in);
	void insert()
	{
		
		System.out.println("enter the name of student: ");
		name=n.nextLine();
		System.out.println("enter the roll number: ");
		roll=n.nextInt();
		System.out.println("enter the marks: ");
		for(int i=0;i<5;i++)
		{
			mark[i]=n.nextInt();
		}
	}
	void display()
	{
		int sum=0;
		System.out.println("name: "+name);
		System.out.println("roll number: "+roll);
		for(int i=0;i<5;i++)
		{
			sum=sum+mark[i];
		}
		System.out.println("total: "+sum);
		int percentage=(sum*100)/500;
		System.out.println("percentage: "+percentage);
	}
	public static void main(String args[])
	{
		student s=new student();
		s.insert();
		s.display();
	}
}
