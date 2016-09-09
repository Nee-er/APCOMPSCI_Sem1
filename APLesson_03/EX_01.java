import java.util.Scanner;

public class EX_01
{
	public static void main (String[]args)
	{
		Scanner RudeAI = new Scanner(System.in);
		
		
		System.out.println("What is your name?");
		
		String name = RudeAI.nextLine();
		
		System.out.println(name + "? That's a dumb name!");
	}
}