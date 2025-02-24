import java.util.*;
class leap
{
	void year()
	{
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the starting year: ");
		int a=n.nextInt();
		System.out.println("Enter the ending year: ");
		
		int b=n.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(i%400==0 || i%4==0 && i%100!=0)
			{
		
				System.out.println(+i);	
		
			}
		}
	}
	public static void main(String args[])
	{
		leap y=new leap();
		y.year();
	}
}
