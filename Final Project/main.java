import java.util.Scanner;
public class main
{
	public static void main(String[]args)
	{
		level test = new level(5);
		Scanner kb = new Scanner(System.in);
		int[][]shape = test.getShape();
		int score = 0;
		boolean playing = true;
		while(playing)
		{
			test.printLevel();
			System.out.println("What would you like to do?\n-Move\n-Leave\n");
			String firstChoice = kb.nextLine();
		
			if(firstChoice.equalsIgnoreCase("move"))
			{
				score += test.move("move");
			}
			else if(firstChoice.equalsIgnoreCase("leave"))
			{
				playing = false;
				
				System.out.println("Score: " + score);
			}
		}
	}
}