import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class level
{
	private static int[][] shape;
	private int endI;
	private int endY;
	
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
	
	public int getEndI()
	{
		return endI;
	}
	
	public int getEndY()
	{
		return endY;
	}
	
	public void setLevel()
	{
		Random rand = new Random();
		for(int i = 0; i < shape.length; i++)
		{
			for(int y = 0; y < shape[0].length; y++)
			{
				shape[i][y] = 0;
			}
		}
		
		int startI = rand.nextInt(shape.length);
		int startY = rand.nextInt(shape[0].length);
		endI = rand.nextInt(shape.length);
		endY = rand.nextInt(shape[0].length);
		int fakeEndI = rand.nextInt(shape.length);
		int fakeEndY = rand.nextInt(shape[0].length);
		int fakeEndI2 = rand.nextInt(shape.length);
		int fakeEndY2 = rand.nextInt(shape[0].length);
		
		
		System.out.println(startI +" "+ startY+", "+endI+" "+endY+", "+fakeEndI+" "+fakeEndY+", "+fakeEndI2+" "+fakeEndY2);
		shape[startI][startY] = 2;
		shape[endI][endY] = 3;
		
		//basic layout
		if(startI > endI)
		{
			for(int i = startI - 1; i >= endI; i--)
			{
				shape[i][startY] = 1;
				
			}
		}
		if(startI < endI)
		{
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
		
		//branching paths
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
		String room = "|_|";
		String filledRoom = "|x|";
		String empty = "....";
		
		for(int y = 0; y < shape[0].length; y++)
		{
			for(int i = 0; i < shape.length; i++)
			{
				if(i == shape.length - 1)
				{
					if(!(shape[i][y] == 0) && !(shape[i][y] == 2))
					{
						System.out.format("%-8s", room);
						System.out.println();
					}
					else if(shape[i][y] == 2)
					{
						System.out.format("%-8s", filledRoom);
						System.out.println();
					}
				
					else
					{
						System.out.format("%-8s", empty);
						System.out.println();
					}
				}
				else if(!(shape[i][y] == 0) && !(shape[i][y] == 2))
				{
					System.out.format("%-8s", room);
				}
				else if(shape[i][y] == 2)
				{
					System.out.format("%-8s",filledRoom);
				}
				
				else
					System.out.format("%-8s", empty);
			}
		}
	}
	
	public static void startTree()
	{
		Scanner kb = new Scanner(System.in);
		
	}
	
	public static int move(String c)
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
			boolean keepGoing = true;
			System.out.println("\nWhich direction?");
			
			for(int y = 0; y < shape[0].length; y++)
			{
				for(int i = 0; i < shape.length; i++)
				{
					if(shape[i][y] == 2)
					{
						iLoc = i;
						yLoc = y;
						
						if(!(y==0))
						{
							if(!(shape[i][y-1]== 0))
							{
								System.out.println("-Up");
								up = true;
							
							}
						}
						if(!(y==shape[0].length-1))
						{
							if(!(shape[i][y+1]== 0))
							{
								System.out.println("-Down");
								down = true;
							}
						}
						if(!(i==0))
						{
							if(!(shape[i-1][y]== 0))
							{
								System.out.println("-Left");
								left = true;
							}
						}
						if(!(i==shape.length-1))
						{
							if(!(shape[i+1][y]== 0))
							{
								System.out.println("-Right");
								right = true;
							}
						}
						System.out.println("\n-Go Back\n");
					}
				}
			}
			
			String moveChoice = kb.nextLine();
			System.out.println();
						if(up)
						{
							if(moveChoice.equalsIgnoreCase("up"))
							{
								shape[iLoc][yLoc-1] = 2;
								shape[iLoc][yLoc] = 1;
								return 1;
							}
						}
						
						if(left)
						{
							if(moveChoice.equalsIgnoreCase("left"))
							{
								shape[iLoc-1][yLoc] = 2;
								shape[iLoc][yLoc] = 1;
								return 1;
							}
						}
						
						if(down)
						{
							if(moveChoice.equalsIgnoreCase("down"))
							{
								shape[iLoc][yLoc+1] = 2;
								shape[iLoc][yLoc] = 1;
								return 1;
							}
						}
						
						if(right)
						{
							if(moveChoice.equalsIgnoreCase("right"))
							{
								shape[iLoc+1][yLoc] = 2;
								shape[iLoc][yLoc] = 1;
								return 1;
							}
						}
						else if(moveChoice.equalsIgnoreCase("go back"))
						{
							return 0;
						}
		}
		return 0;
	}
}