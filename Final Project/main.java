import java.util.Scanner;
public class main
{
	public static void main(String[]args)
	{
		level test = new level(20);
		Scanner kb = new Scanner(System.in);
		int[][]shape = test.getShape();
		boolean door = false;
		while(!door)
		{
			test.printLevel();
			System.out.println("What would you like to do?\n-Move\n-Bag\n-Leave\n");
			String firstChoice = kb.nextLine();
		
			if(firstChoice.equalsIgnoreCase("move"))
			{
				test.move("move");
			}
		}
	}
}