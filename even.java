import java.util.*;
class even
{
	
	void ev()
	{
	Scanner e=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=e.nextInt();
		if(a%2==0)
		{
			System.out.println("even!!");
		}
		else
		{
			System.out.println("odd!!");
		}
	}
	public static void main(String args[])
	{
		even n=new even();
		n.ev();
	}
}
