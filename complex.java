import java.util.*;
class complex
{
	int real,img;
	void read()
	{
		Scanner sc=new Scanner(System.in);
		real=sc.nextInt();
		img=sc.nextInt();
	}
	void add(complex c1,complex c2)
	{
		real=c1.real+c2.real;
		img=c1.img+c2.img;
		System.out.println("addition: "+real+"+i"+img);
	}
	public static void main(String args[])
	{
		complex c1=new complex();
		System.out.println("Enter 1st number: ");
		c1.read();
		complex c2=new complex();
		System.out.println("Enter 2nd number: ");
		c2.read();
		complex c=new complex();
		c.add(c1,c2);
	}
}
