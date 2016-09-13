import java.util.Scanner;

public class EX_01
{
	public static void main (String[]args)
	{
		Scanner RudeAI = new Scanner(System.in);
		
		
		System.out.println("What is your name?");
		
		String name = RudeAI.nextLine();
		
		System.out.println(name + "? That's a dumb name!");
		
		
		System.out.println("How old are you, " + name + "?");
		
		String age = RudeAI.nextLine();
		
		System.out.println("Wow! " + age + "? You are so old, the candles on your birthday cake raised Earth's temperature by 3 degrees.");
		
		
		System.out.println("What do you do for fun, " + name + "?");
		
		String fun = RudeAI.nextLine();
		
		System.out.println(fun + "? I'd literally rather watch paint dry!");
		
		
		System.out.println("You're honestly so boring, " + name + ", but what kind of music do you like?");
		
		String music = RudeAI.nextLine();
		
		System.out.println("No one likes " + music + "! It's not real art!");
		
		
		System.out.println("How many siblings do you have, " + name + "?");
		
		String siblings = RudeAI.nextLine();
		
		System.out.println("Ugh! That's " + siblings + " too many if they are anything like you!");
		
		
		System.out.println("What do you want to be when you grow up?");
		
		String job = RudeAI.nextLine();
		
		System.out.println("You're " + age + ", " + name + ". \nHaven't you made more realistic expectations? \nI mean you like to " + fun + " and listen to " + music + ". \nYou think you're going to make it as a " + job + "? \nJust kidding, " + name + ", I'm literally just 51 lines of code.");
	}
}