import java.util.Scanner;

public class SpaceShooter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your target location from 1-100: ");
		int target = kb.nextInt();
		int enemyLoc = (int)(Math.random()*100)+1;
		
		if(target == enemyLoc)
			System.out.println("It's a hit!");
		else
			System.out.println("Miss!");
	}
}