import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class level
{
	private static int[][] shape;
	
	public level()
	{
		shape = new int[1][1];
	}
	
	public level(int x)
	{
		shape = new int[x][x];
		setLevel();
	}
	
	public int[][] getShape()
	{
		return shape;
	}
	
	public void setLevel()
	{
		Random rand = new Random();
		
		int startI = rand.nextInt(shape.length);
		int startY = rand.nextInt(shape[0].length);
		int endI = rand.nextInt(shape.length);
		int endY = rand.nextInt(shape[0].length);
		int fakeEndI = rand.nextInt(shape.length);
		int fakeEndY = rand.nextInt(shape[0].length);
		int fakeEndI2 = rand.nextInt(shape.length);
		int fakeEndY2 = rand.nextInt(shape[0].length);
		
		
		System.out.println(startI +" "+ startY+", "+endI+" "+endY+", "+fakeEndI+" "+fakeEndY+", "+fakeEndI2+" "+fakeEndY2);
		shape[startI][startY] = 2;
		shape[endI][endY] = 1;
		
		if(startI > endI)
		{
			int branch = rand.nextInt(startI) + endI;
			for(int i = startI - 1; i >= endI; i--)
			{
				shape[i][startY] = 1;
				
			}
		}
		if(startI < endI)
		{
			int branch = rand.nextInt(endI) + startI;
			for(int i = startI + 1; i <= endI; i++)
			{
				shape[i][startY] = 1;
			}
		}
		if(startY > endY)
		{
			for(int y = startY - 1; y >= endY; y--)
			{
				shape[endI][y] = 1;
			}
		}
		if(startY < endY)
		{
			for(int y = startY + 1; y <= endY; y++)
			{
				shape[endI][y] = 1;
			}
		}
		
		if(startY > fakeEndY)
		{
			for(int y = startY - 1; y >= fakeEndY; y--)
			{
				shape[startI][y] = 1;
			}
		}
		if(startY < fakeEndY)
		{
			for(int y = startY + 1; y <= fakeEndY; y++)
			{
				shape[startI][y] = 1;
			}
		}
		if(startI > fakeEndI)
		{
			for(int i = startI - 1; i >= fakeEndI; i--)
			{
				shape[i][fakeEndY] = 1;
			}
		}
		if(startI < fakeEndI)
		{
			for(int i = startI + 1; i <= fakeEndI; i++)
			{
				shape[i][fakeEndY] = 1;
			}
		}
		
		
		if(startI > fakeEndI2)
		{
			for(int i = startI - 1; i >= fakeEndI2; i--)
			{
				shape[i][startY] = 1;
			}
		}
		if(startI < fakeEndI2)
		{
			for(int i = startI + 1; i <= fakeEndI2; i++)
			{
				shape[i][startY] = 1;
			}
		}
		if(startY > fakeEndY2)
		{
			for(int y = startY - 1; y >= fakeEndY2; y--)
			{
				shape[fakeEndI2][y] = 1;
			}
		}
		if(startY < fakeEndY2)
		{
			for(int y = startY + 1; y <= fakeEndY2; y++)
			{
				shape[fakeEndI2][y] = 1;
			}
		}
	}
	
	public void printLevel()
	{
		String room = "| |";
		String filledRoom = "|x|";
		String empty = ".  ";
		
		for(int y = 0; y < shape[0].length; y++)
		{
			for(int i = 0; i < shape.length; i++)
			{
				if(i == shape.length - 1)
				{
					if(shape[i][y] == 1)
					{
						System.out.printf("%8s\n", room);
					}
					else if(shape[i][y] == 2)
					{
						System.out.printf("%8s\n", filledRoom);
					}
				
					else
						System.out.printf("%8s\n", empty);
				}
				else if(shape[i][y] == 1)
				{
					System.out.printf("%8s", room);
				}
				else if(shape[i][y] == 2)
				{
					System.out.printf("%8s",filledRoom);
				}
				
				else
					System.out.printf("%8s", empty);
			}
		}
	}
	
	public static void startTree()
	{
		Scanner kb = new Scanner(System.in);
		
	}
	
	public static void move(String c)
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
						
						
						String moveChoice = kb.nextLine();
						if(!(y == 0))
						{
							if(shape[i][y-1]== 1)
							{
								if(moveChoice.equalsIgnoreCase("up"))
								{
									shape[i][y-1] = 2;
									shape[i][y] = 1;
								}
							}
						}
						if(!(y == shape[0].length))
						{
							if(shape[i][y+1]== 1)
							{
								if(moveChoice.equalsIgnoreCase("down"))
								{
									shape[i][y+1] = 2;
									shape[i][y] = 1;
								}
							}
						}
						if(!(i == 0))
						{
							if(shape[i-1][y]== 1)
							{
								if(moveChoice.equalsIgnoreCase("left"))
								{
									shape[i-1][y] = 2;
									shape[i][y] = 1;
								}
							}
						}
						if(!(i == shape.length))
						{
							if(shape[i+1][y]== 1)
							{
								if(moveChoice.equalsIgnoreCase("right"))
								{
									shape[i+1][y] = 2;
									shape[i][y] = 1;
								}
							}
						}
					}
				}
			}
		}
	}
}