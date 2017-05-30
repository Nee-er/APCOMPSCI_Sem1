import java.util.Scanner;
public class main
{
	public static void main(String[]args)
	{
		
		int size = 5;
		level test = new level(size);
		Scanner kb = new Scanner(System.in);
		int[][]shape = test.getShape();
		int score = 0;
		boolean playing = true;
		boolean door = true;
		while(playing)
		{
			if(door)
			{
				test.setLevel();
				door = false;
				size++;
			}
			test.printLevel();
			System.out.println("What would you like to do?\n-Move\n-Leave\n");
			String firstChoice = kb.nextLine();
		
			if(firstChoice.equalsIgnoreCase("move"))
			{
				if(test.move("move"))
				{
					door = true;
					score++;
				}
			}
			else if(firstChoice.equalsIgnoreCase("leave"))
			{
				playing = false;
				
				System.out.println("Score: " + score);
			}
		}
	}
}