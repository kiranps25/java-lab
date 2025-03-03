import java.util.*;
class employee
{
	String e_name;
	int e_no,e_salary;
	
	void read()
	{
	Scanner n=new Scanner(System.in);
		System.out.print("Enter the employee name: ");
		e_name=n.nextLine();
		System.out.print("Enter the employee no: ");
		e_no=n.nextInt();
		System.out.print("Enter the emplyee salary: ");
		e_salary=n.nextInt();
	}
	void search(int e_sno)
	{
		
		
		
		
			if(e_no==e_sno)
			{
				System.out.println("employee no: "+e_no);
				System.out.println("employee name: "+e_name);
				System.out.println("employee salary: "+e_salary);
			}
		
		
	}
	public static void main(String args[])
	{
		Scanner n=new Scanner(System.in);
		employee emp[]=new employee[3];
		for(int i=0;i<3;i++)
		{
			emp[i]=new employee();
			emp[i].read();
			
		}
		System.out.print("enter the employee number to search: ");
		int e_sno=n.nextInt();
		for(int i=0;i<3;i++)
		{
		emp[i].search(e_sno);
		}
		
	}
}
