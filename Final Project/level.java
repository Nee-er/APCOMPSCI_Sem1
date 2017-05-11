import java.util.Arrays;
import java.util.Random;
public class level
{
	private int[][] shape;
	
	public level()
	{
		shape = new int[1][1];
	}
	
	public level(int x)
	{
		shape = new int[x][x];
	}
	
	public void setLevel()
	{
		Random rand = new Random();
		
		int start = rand.nextInt(shape.length);
		
		shape[start][0] = 1;
		
		for(int i = 0; i < shape.length - 1; i++)
		{
			if(rand.nextInt(2) == 1)
			{
				shape[i][0] = 1;
			}
			for(int y = 1; y < shape[0].length; y++)
			{
				if(shape[i][y-1] == 1)
				{
					shape[i][y] = 1;
				}
			}
		}
	}
	
	public void printLevel()
	{
		for(int i = 0; i < shape[0].length; i++)
		{
			for(int y = 0; y < shape.length; y++)
			{
				if(y == shape.length - 1)
				{
					if(shape[y][i] == 1)
					{
						System.out.print("|_|\n");
					}
				
					else
						System.out.print("   \n");
				}
				else if(shape[i][y] == 1)
				{
					System.out.print("|_|");
				}
				
				else
					System.out.print("    ");
			}
		}
	}
}