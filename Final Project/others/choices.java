import java.util.Scanner;
public class choices
{
	private static int[][]shape;
	public choices(int[][] s)
	{
		int[][]shape = s;
	}
	
	public static void startTree()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What would you like to do?\n-Move\n-Bag\n-Leave\n");
		String firstChoice = kb.nextLine();
		
		choices(firstChoice);
	}
	
	public static void choices(String c)
	{
		Scanner kb = new Scanner(System.in);
		if(c.equalsIgnoreCase("move"))
		{
			boolean right = false;
			boolean left = false;
			boolean up = false;
			boolean down = false;
			int iLoc = 0;
			int yLoc = 0;
			System.out.println("Which direction?");
			for(int y = 0; y < shape[0].length; y++)
			{
				for(int i = 0; i < shape.length; i++)
				{
					if(shape[i][y] == 2)
					{
						iLoc = i;
						yLoc = y;
						if(!(y == 0))
						{
							if(shape[i][y-1]== 1)
							{
								System.out.println("-Up");
								up = true;
							}
						}
						if(!(y == shape[0].length))
						{
							if(shape[i][y+1]== 1)
							{
								System.out.println("-Down");
								down = true;
							}
						}
						if(!(i == 0))
						{
							if(shape[i-1][y]== 1)
							{
								System.out.println("-Left");
								left = true;
							}
						}
						if(!(i == shape.length))
						{
							if(shape[i+1][y]== 1)
							{
								System.out.println("-Right");
								right = true;
							}
						}
					}
				}
			}
			String moveChoice = kb.nextLine();
		
			if(moveChoice.equalsIgnoreCase("up"))
			{
				shape[iLoc][yLoc-1] = 2;
				shape[iLoc][yLoc] = 1;
			}
		}
	}
}