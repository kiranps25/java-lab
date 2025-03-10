import java.util.*;
class area
{
	Scanner n=new Scanner(System.in);
	void read(int l,int b)
	{
		
		int a=l*b;
		System.out.println("Area of rectangle: "+a);
	}
	void read(int s)
	{
		
		int a=s*s;
		System.out.println("area of square: "+a);
	}
	void read(float r)
	{
		
		float a=3.14f*r*r;
		System.out.println("area of circle: "+a);
	}
	public static void main(String args[])
	{
		area ob=new area();
		System.out.println("enter the length of rectangle: ");	
		int l=ob.n.nextInt();
		System.out.println("enter the breath of rectangle: ");	
		int b=ob.n.nextInt();
		ob.read(l,b);
		System.out.println("enter the side of square: ");	
		int s=ob.n.nextInt();
		ob.read(s);
		System.out.println("enter the radius of circle: ");	
		float r=ob.n.nextFloat();
		ob.read(r);
	}
}
