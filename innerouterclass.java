import java.util.*;
class cpu
{
int price=50000;

	class processor
	{
		int core=7;
		String manufacture="intel";
		void displayp()
		{
			System.out.println("core: "+core);
			System.out.println("manufacture: "+manufacture);
		}
	}
	static class ram
	{
		int memory=64;
		String mmanufacture="sandisk";
		void displayr()
		{
			System.out.println("memory: "+memory+"gb");
			System.out.println("manufacture: "+mmanufacture);
		}
	}
	public static void main(String args[])
	{
		cpu c=new cpu();
		cpu.processor p=c.new processor();
		p.displayp();
		cpu.ram r=new cpu.ram();
		r.displayr();
	} 
}

