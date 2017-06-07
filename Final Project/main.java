import java.util.Scanner;
import java.util.Random;
public class main
{
	private static int size = 5;
	private static level test = new level(5);
	private static Scanner kb = new Scanner(System.in);
	private static int score;
	private static int badHealth;
	private static boolean playing;
	private static int difficulty = 0;
	
	public static void main(String[]args)
	{
		Random rand = new Random();
		int[][]shape = test.getShape();
		score = 100;
		playing = true;
		boolean door = true;
		boolean progress = false;
		int number = 0;
		while(playing)
		{
			if(door)
			{
				test.setLevel();
				door = false;
			}
			
			test.printLevel();
			System.out.println("What would you like to do?\n-Move\n-Leave\nYou have " + score + " health\n");
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
						badHealth = rand.nextInt(30) + 20 + difficulty;
						fight(playing, true);
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
	
	public static int fight(boolean p, boolean f)
	{
		Random rand = new Random();
		int dmgDealt = 0;
		int dmgRec = 0;
		if(f)
		{
			System.out.println("\nYou encountered a monster!\n");
			f = false;
		}
		System.out.println("What would you like to do?\nYou have " + score + " health.\nThe monster has " + badHealth + " health\n-Fight\n-Run\n");
		if(kb.nextLine().equalsIgnoreCase("run"))
		{
			int lost = rand.nextInt(20) + 10;
			score-=lost;
			System.out.println("\nHealth -" + lost + "\n");
			if(score <= 0)
			{
				System.out.println("Health: 0\nGame Over!");
				playing = false;
			}
			return 0;
		}
		if(kb.nextLine().equalsIgnoreCase("fight"))
		{
				if(rand.nextInt(1) == 0)
				{
					System.out.println("You swing your sword at the monster!");
					
					dmgDealt = rand.nextInt(30)+20;
					badHealth-=dmgDealt;
					System.out.println("You dealt "+ dmgDealt +" damage!\n");
					if(badHealth > 0)
					{
						System.out.println("The monster attacked you!");
						dmgRec = rand.nextInt(30) + 10 + difficulty;
						System.out.println("You received " + dmgRec + "damage!\n");
						score -= dmgRec;
						if(score <= 0)
						{
							System.out.println("Health: 0\nGame Over!");
							playing = false;
							return 0;
						}
					}
					else if(badHealth <= 0)
					{
						System.out.println("You slayed the monster!\nHealth +10");
						score += 10;
						difficulty += 2;
						return 0;
					}
					else
					{
						fight(p, false);
					}
				}
				else
				{
					System.out.println("The monster attacks you!");
					dmgRec = rand.nextInt(30) + 10 + difficulty;
					score-=dmgRec;
					System.out.println("You received "+ dmgRec +" damage!\n");
					if(score > 0)
					{
						System.out.println("You swing your sword at the monster!");
						dmgDealt = rand.nextInt(30)+20;
						badHealth-=dmgDealt;
						System.out.println("You dealt "+ dmgDealt +" damage!\n");
						if(badHealth <= 0)
						{
							System.out.println("You slayed the monster!\nHealth +10");
							score += 10;
							difficulty += 2;
							return 0;
						}
						else
						{
							fight(p, false);
						}
					}
					else if(score <= 0)
					{
						System.out.println("Health: 0\nGame Over!");
						playing = false;
						return 0;
					}
				}
			}
			
			if(score <= 0)
			{
				System.out.println("Health: 0\nGame Over!");
				playing = false;
				return 0;
			}
			
			fight(p, false);
		}
		else
		{
			System.out.println("Pick a move.\n");
			fight(p, false);
		}
		return 0;
	}
}