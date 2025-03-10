import java.util.*;
class charsort
{
	Scanner n=new Scanner(System.in);
	String word;
	void string()
	{
		System.out.println("Enter the word: ");
		word=n.nextLine();
		char[] charArray = word.toCharArray();
		Arrays.sort(charArray);
		System.out.println("sorted: ");
		System.out.println(charArray);
	}
	public static void main(String args[])
	{
		charsort ob=new charsort();
		ob.string();
	}
}
