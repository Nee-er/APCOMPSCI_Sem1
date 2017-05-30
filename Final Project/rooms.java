import java.util.Scanner;
public class rooms
{
	public rooms()
	{
		int room = 0;
	}
	
	public static boolean door()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("You found the door to the next level.\n\nWould you like to proceed?");
		String answer = kb.nextLine();
		
		if(answer.equalsIgnoreCase("yes"))
		{
			return true;
		}
		return false;
	}
}