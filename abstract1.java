import java.util.*;
abstract class shape
{
	abstract void area();
	
}
class rectangle extends shape
{
	int l,b,a;
	void area()
	{
		Scanner n=new Scanner(System.in);
		System.out.println("enter the length of rect: ");
		int l=n.nextInt();
		System.out.println("enter the breadth of rect: ");
		int b=n.nextInt();
		a=l*b;
		System.out.println("area of rectangle: "+a);
	}
}
class circle extends shape
{
	float r,a;
	void area()
	{
		Scanner n=new Scanner(System.in);
		System.out.println("enter the radius of rect: ");
		float r=n.nextFloat();
		double a=3.14*r*r;
		System.out.println("area of circle: "+a);
	}
}
class square extends shape
{
	int s,a;
	void area()
	{
		Scanner n=new Scanner(System.in);
		System.out.println("enter the side of square: ");
		int s=n.nextInt();
		a=s*s;
		System.out.println("area of square: "+a);	
	}	
}
class Main
{
	public static void main(String args[])
	{
		rectangle r=new rectangle();
		circle c=new circle();
		square s=new square();
		r.area();
		c.area();
		s.area();
	}
}
