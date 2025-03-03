import java.util.*;
class search
{
	Scanner n=new Scanner(System.in);
	int[] a=new int[5];
	void insert()
	{
		System.out.println("enter the elements");
		for(int i=0;i<5;i++)
		{
			a[i]=n.nextInt();
		}
	}
	void find()
	{
	int f=0;
		System.out.println("enter the element to search: ");
		int b=n.nextInt();
		for(int i=0;i<5;i++)
		{
			if(a[i]==b)
			{
				f=1;
			}
		}
		if(f==1)
		{
			System.out.println("element "+b+" found");
		}
		else
		{
			System.out.println("element "+b+" not found");
		}
	}
	public static void main(String args[])
	{
		search s=new search();
		s.insert();
		s.find();
	}
}
