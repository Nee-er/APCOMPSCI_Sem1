import java.util.Scanner;

public class Ex_05
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		story();
	}
	
	public static void story()
	{
		System.out.println("Would you like to play a game?");
		String choice = kb.next();
		kb.nextLine();
		if(choice.equals("Y") || choice.equals("N"))
		{
			if(choice.equals("Y"))
			{
				System.out.println("Ok!");
			}
			if(choice.equals("N"))
			{
				System.out.println("Ok.");
			}
		}
		else
		{
			System.out.println("Enter Y or N");
			story();
		}
	}
	
	public static void story1()
	{
		System.out.println("Would you like to play a game?");
		String choice = kb.next();
		kb.nextLine();
		if(choice.equals("Y") || choice.equals("N"))
		{
			if(choice.equals("Y"))
			{
				System.out.println("Ok!");
			}
			if(choice.equals("N"))
			{
				System.out.println("Ok.");
			}
		}
		else
		{
			System.out.println("Enter Y or N");
			story();
		}
	}
}