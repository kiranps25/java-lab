import java.util.*;
class product
{
	String pname;
	int pcode,price;
	void read()
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the product name");
		pname=a.nextLine();
		System.out.println("Enter the product code");
		pcode=a.nextInt();
		System.out.println("Enter the product price");
		price=a.nextInt();
	}
	void comp(product p1,product p2,product p3)
	{
		if(p1.price<p2.price && p1.price<p3.price)
		{
			System.out.println("product 1 has lowest price");
		}
		else if(p2.price<p1.price && p2.price<p3.price)
		{
			System.out.println("product 2 has lowest price");
		}
		else
		{
			System.out.println("product 3 has lowest price");
		}
		
	}
	public static void main(String args[])
	{
		product p1=new product();
		System.out.println("Enter 1st product: ");
		p1.read();
		product p2=new product();
		System.out.println("Enter 2nd product: ");
		p2.read();
		product p3=new product();
		System.out.println("Enter 3rd product: ");
		p3.read();
		product p=new product();
		p.comp(p1,p2,p3);
	}
	
}
