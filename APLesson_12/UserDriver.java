import java.util.Scanner;
public class UserDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = kb.nextLine();
		System.out.println("Enter your last name:");
		String lastName = kb.nextLine();
		
		System.out.println("Would you like to use a public avatar? (y or n)");
		String answer = kb.nextLine();
		
		if(answer.equals("n"))
		{
			User object = new User(firstName, lastName);
			System.out.println();
			System.out.println(object);
		}
		else
		{
			System.out.println("Enter your avatar name:");
			String avatar = kb.nextLine();
			
			User object = new User(firstName, lastName, avatar);
			System.out.println();
			System.out.println(object);
		}
	}
}