interface functions
{
	void area();
	void perimeter();
}
class circle implements functions
{
	int r=4;
	public void area()
	{
		double area=3.14*r*r;
		System.out.println("area of circle: "+area);
	}
	public void perimeter()
	{
		double perimeter=2*3.14*r;
		System.out.println("perimeter of circle: "+perimeter);
	}
}
class rectangle implements functions
{
	int l=8;
	int b=4;
	public void area()
	{
		double area=l*b;
		System.out.println("area of rectangle: "+area);
	}
	public void perimeter()
	{
		double perimeter=2*(l+b);
		System.out.println("perimeter of rectangle: "+perimeter);
	}
}
class Main
{
	public static void main(String args[])
	{
		rectangle r=new rectangle();
		r.area();
		r.perimeter();
		circle c=new circle();
		c.area();
		c.perimeter();
	}
}
