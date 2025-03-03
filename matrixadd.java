import java.util.*;
class matrixadd
{
	Scanner n=new Scanner(System.in);
	int[][] a=new int[3][3];
	int[][] b=new int[3][3];
	void insert()
	{
		System.out.println("enter the metrix1 element: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=n.nextInt();
			}	
		}
		System.out.println("enter the matrix2: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=n.nextInt();
			}
		}
	}
	void add()
	{
		int[][] s=new int[3][3];
		System.out.println("sum: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				s[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println("");
		}
	}
	void sym()
	{
	int f=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]!=a[j][i])
				{
					f=1;
				}
			}
		}
		if(f==1)
		{
			System.out.println("not symmetric");
		}
		else
		{
			System.out.println("symmetric");
		}
	}
	public static void main(String args[])
	{
		matrixadd k=new matrixadd();
		k.insert();
		k.add();
		k.sym();
	}
}
