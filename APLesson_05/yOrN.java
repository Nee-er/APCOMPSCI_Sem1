import java.util.Scanner;
public class yOrN
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		recursion();
	}
	
	public static void recursion()
	{
		System.out.println("Would you like to some recursion?");
		String choice = kb.next();
		if(choice.equals("Y") || choice.equals("N"))
		{
			if(choice.equals("Y"))
			{
				System.out.println("Let's do this!");
				recursion();
			}
			else
				System.out.println("Ok.");
		}
		else
		{
			System.out.println("Answer Y or N");
			recursion();
		}
	}
}
