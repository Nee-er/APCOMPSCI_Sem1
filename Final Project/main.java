import java.util.Scanner;
public class main
{
	private static int size = 5;
	private static level test = new level(5);
	private static Scanner kb = new Scanner(System.in);
	
	public static void main(String[]args)
	{
		int[][]shape = test.getShape();
		int score = 100;
		boolean playing = true;
		boolean door = true;
		boolean progress = false;
		int number = 0;
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
					score+=20;
				}
				else
				{
					number = test.room();
					if(number == 1)
					{
						fight(score, playing);
					}
					else
					{
						score+=number;
					}
				}
			}
			else if(firstChoice.equalsIgnoreCase("leave"))
			{
				playing = false;
				
				System.out.println("Health: " + score);
			}
		}
	}
	
	public static void fight(int h, boolean p)
	{
		System.out.println("\nYou encountered a monster!\nWhat would you like to do?\n-Fight\n-Run");
		if(kb.nextLine().equalsIgnoreCase("run"))
		{
			test.fight(true);
		}
	}
}