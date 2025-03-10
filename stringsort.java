import java.util.*;
class stringsort
{
	
	Scanner n=new Scanner(System.in);
	String[] arr=new String[5];
	void read()
	{
		System.out.println("enter the words: ");
		for(int i=0;i<5;i++)
		{
			arr[i]=n.nextLine();
		}
		Arrays.sort(arr);
		System.out.println("sorted array: ");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])
	{
		stringsort ob=new stringsort();
		ob.read();
	}
}
