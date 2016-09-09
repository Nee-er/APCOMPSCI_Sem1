import java.util.Scanner; //import Statement

public class Lesson_03
{
	public static void main (String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner dog = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("Who is your favorite teacher? ");
		
		String teacher = dog.nextLine();
		
		System.out.println("Okay! " + teacher + " is very good!");
	}
}