import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class level
{
	private static int[][] shape;
	private int endI;
	private int endY;
	private static int difficulty;
	private static int size;
	private static boolean encounter;
	private static boolean scoreUp;
	private static boolean fight;
	private static int iLoc = 0;
	private static int yLoc = 0;
	private static String moveChoice = "";
	
	public level()
	{
		shape = new int[1][1];
		difficulty = 0;
		encounter = false;
		scoreUp = false;
		fight = false;
	}
	
	public level(int x)
	{
		shape = new int[x][x];
		difficulty = 0;
		encounter = false;
		scoreUp = false;
		fight = false;
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
	
	
	/* array key:
	0 no room
	1 empty room
	2 player room
	3 door to next level 
	4 score +
	5 enemy
	*/
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
		
		
	
		shape[startI][startY] = 2;
		shape[endI][endY] = 3;
		
		//basic layout
		if(startI > endI)
		{
			for(int i = startI - 1; i >= endI; i--)
			{
				if(!(shape[i][startY] == 3))
				{
					shape[i][startY] = 1;
				}
			}
		}
		if(startI < endI)
		{
			for(int i = startI + 1; i <= endI; i++)
			{
				if(!(shape[i][startY] == 3))
				{
					shape[i][startY] = 1;
				}
			}
		}
		if(startY > endY)
		{
			for(int y = startY - 1; y >= endY; y--)
			{
				if(!(shape[endI][y] == 3))
				{
					shape[endI][y] = 1;
				}
			}
		}
		if(startY < endY)
		{
			for(int y = startY + 1; y <= endY; y++)
			{
				if(!(shape[endI][y] == 3))
				{
					shape[endI][y] = 1;
				}
			}
		}
		
		//branching paths
		if(startY > fakeEndY)
		{
			for(int y = startY - 1; y >= fakeEndY; y--)
			{
				if(!(shape[startI][y] == 3))
				{
					shape[startI][y] = 1;
				}
			}
		}
		if(startY < fakeEndY)
		{
			for(int y = startY + 1; y <= fakeEndY; y++)
			{
				if(!(shape[startI][y] == 3))
				{
					shape[startI][y] = 1;
				}
			}
		}
		if(startI > fakeEndI)
		{
			for(int i = startI - 1; i >= fakeEndI; i--)
			{
				if(!(shape[i][fakeEndY] == 3))
				{
					shape[i][fakeEndY] = 1;
				}
			}
		}
		if(startI < fakeEndI)
		{
			for(int i = startI + 1; i <= fakeEndI; i++)
			{
				if(!(shape[i][fakeEndY] == 3))
				{
					shape[i][fakeEndY] = 1;
				}
			}
		}
		
		if(startI > fakeEndI2)
		{
			for(int i = startI - 1; i >= fakeEndI2; i--)
			{
				if(!(shape[i][startY] == 3))
				{
					shape[i][startY] = 1;
				}
			}
		}
		if(startI < fakeEndI2)
		{
			for(int i = startI + 1; i <= fakeEndI2; i++)
			{
				if(!(shape[i][startY] == 3))
				{
					shape[i][startY] = 1;
				}
			}
		}
		if(startY > fakeEndY2)
		{
			for(int y = startY - 1; y >= fakeEndY2; y--)
			{
				if(!(shape[fakeEndI2][y] == 3))
				{
					shape[fakeEndI2][y] = 1;
				}
			}
		}
		if(startY < fakeEndY2)
		{
			for(int y = startY + 1; y <= fakeEndY2; y++)
			{
				if(!(shape[fakeEndI2][y] == 3))
				{
					shape[fakeEndI2][y] = 1;
				}
			}
		}
		
		//populate level
		/* 
		4 score +
		5 enemy */
		int enemy = 0;
		int score = 0;
		for(int i = 0; i < shape.length; i++)
		{
			for(int y = 0; y < shape[0].length; y++)
			{
				if(shape[i][y] == 1)
				{
					if(difficulty < 2)
					{
						enemy = rand.nextInt(2);
						score = rand.nextInt(4);
						if(enemy == 0)
						{
							shape[i][y] = 5;
						}
						if(score == 0)
						{
							shape[i][y] = 4;
						}
					}
					if(difficulty > 2 && difficulty < 5)
					{
						enemy = rand.nextInt(2);
						score = rand.nextInt(4);
						if(score == 0)
						{
							shape[i][y] = 4;
						}
						if(enemy == 0)
						{
							shape[i][y] = 5;
						}
					}
					if(difficulty > 5)
					{
						enemy = rand.nextInt(1);
						score = rand.nextInt(4);
						if(score == 0)
						{
							shape[i][y] = 4;
						}
						if(enemy == 0)
						{
							shape[i][y] = 5;
						}
					}
				}
			}
		}
		difficulty++;
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
	
	public static boolean move(String c)
	{
		Scanner kb = new Scanner(System.in);
		moveChoice = " ";
		if(c.equalsIgnoreCase("move"))
		{
			boolean right = false;
			boolean left = false;
			boolean up = false;
			boolean down = false;
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
			
			moveChoice = kb.nextLine();
			boolean next = false;
			System.out.println();
						/* 
						4 score +
						5 enemy
						
						*/
						
						if(up)
						{
							if(moveChoice.equalsIgnoreCase("up"))
							{
								if(shape[iLoc][yLoc-1] == 3)
								{
									next = door();
									if(next)
									{
										difficulty++;
										return true;
									}
									/* else if(!(shape[iLoc][yLoc-2]== 0))
									{
										shape[iLoc][yLoc-2] = 2;
										shape[iLoc][yLoc] = 1;
										return false;
									} */
								}
								else
								{								
									if(shape[iLoc][yLoc-1] == 4 || shape[iLoc][yLoc-1] == 5)
									{
										encounter = true;
										if(shape[iLoc][yLoc-1] == 4)
										{
											scoreUp = true;
											shape[iLoc][yLoc-1] = 2;
											shape[iLoc][yLoc] = 1;
											return false;
										}
										if(shape[iLoc][yLoc-1] == 5)
										{
											fight = true;
											return false;
										}
									}
									else
									{
										shape[iLoc][yLoc-1] = 2;
										shape[iLoc][yLoc] = 1;
										return false;
									}
								}
							}
						}
						
						if(left)
						{
							if(moveChoice.equalsIgnoreCase("left"))
							{
								if(shape[iLoc-1][yLoc] == 3)
								{
									next = door();
									if(next)
									{
										difficulty++;
										return true;
									
									}
									/* else if(!(shape[iLoc-2][yLoc] == 0))
									{
										shape[iLoc-2][yLoc] = 2;
										shape[iLoc][yLoc] = 1;
										return false;
									} */
								}
								else
								{
									if(shape[iLoc-1][yLoc] == 4 || shape[iLoc-1][yLoc] == 5)
									{
										encounter = true;
										if(shape[iLoc-1][yLoc] == 4)
										{
											scoreUp = true;
											shape[iLoc-1][yLoc] = 2;
											shape[iLoc][yLoc] = 1;
											return false;
										}
										if(shape[iLoc-1][yLoc] == 5)
										{
											fight = true;
											return false;
										}
									}
									else
									{
										shape[iLoc-1][yLoc] = 2;
										shape[iLoc][yLoc] = 1;
										return false;
									}
								}
							}
						}
						
						if(down)
						{
							if(moveChoice.equalsIgnoreCase("down"))
							{
								if(shape[iLoc][yLoc+1] == 3)
								{
									next = door();
									if(next)
									{
										return true;
									}
								}
								else
								{
									if(shape[iLoc][yLoc+1] == 4 || shape[iLoc][yLoc+1] == 5)
									{
										encounter = true;
										if(shape[iLoc][yLoc+1] == 4)
										{
											scoreUp = true;
											shape[iLoc][yLoc+1] = 2;
											shape[iLoc][yLoc] = 1;
											return false;
										}
										if(shape[iLoc][yLoc+1] == 5)
										{
											fight = true;
											return false;
										}
									}
									else
									{
										shape[iLoc][yLoc+1] = 2;
										shape[iLoc][yLoc] = 1;
										return false;
									}
								}
							}
						}
						
						if(right)
						{
							if(moveChoice.equalsIgnoreCase("right"))
							{
								if(shape[iLoc+1][yLoc] == 3)
								{
									next = door();
									if(next)
									{
										return true;
									}
								}
								else
								{		
									if(shape[iLoc+1][yLoc] == 4 || shape[iLoc+1][yLoc] == 5)
									{
										encounter = true;
										if(shape[iLoc+1][yLoc] == 4)
										{
											scoreUp = true;
											shape[iLoc+1][yLoc] = 2;
											shape[iLoc][yLoc] = 1;
											return false;
										}
										if(shape[iLoc+1][yLoc] == 5)
										{
											fight = true;
											return false;
										}
									}
									else
									{
										shape[iLoc+1][yLoc] = 2;
										shape[iLoc][yLoc] = 1;
										return false;
									}
								}
							}
						}
						else if(moveChoice.equalsIgnoreCase("go back"))
						{
							return false;
						}
		}
		return false;
	}
	
	public static boolean door()
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("You found the door to the next level!\nWould you like to proceed?\n");
		String answer = kb.nextLine();
		
		if(answer.equalsIgnoreCase("yes"))
		{
			System.out.println("You proceed through the door and move down the stairs.\n");
			return true;
		}
		return false;
	}
	
	public static int room()
	{
		if(encounter)
		{
			if(fight)
			{
				encounter = false;
				return 1;
			}
			
			if(scoreUp)
			{
				System.out.println("You found a health potion! \nHealth+50");
				encounter = false;
				
				return 50;
			}
		}
		encounter = false;
		return 0;
	}
	
	public static int fight(boolean r)
	{
		if(r)
		{
			return -20;
		}
		return 0;
	}
}