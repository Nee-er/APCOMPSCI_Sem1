import java.util.Scanner;

public class Ex_06
{
	static Scanner kb;
	static String username = "SpencerBoat";
	static String password = "password1234";
	
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
	}
	
	public static void passCheck()
	{
		System.out.println("Please login.");
		System.out.println("Enter Username:");
		String unInput = kb.nextLine();
		System.out.println("Enter Password");
		String passInput = kb.nextLine();
		
		if(unInput.equals(username) && passInput.equals(password))
		{
			System.out.println("Access Granted.");
		}
		else
		{
			if(unInput.equals(username))
			{
				System.out.println("The password is incorrect.");
				passCheck();
			}
			if(passInput.equals(password))
			{
				System.out.println("The username is incorrect.");
				passCheck();
			}
			else
			{
				System.out.println("The username and password are incorrect.");
				passCheck();
			}
		}
	}
}