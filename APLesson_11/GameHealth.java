import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class GameGun
{
	static int HEALTHLOAD = 6;
	static String[] health = new String[HEALTHLOAD];
	static int healthcount;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int ammount = 0;
		healthcount = 6;
		
		while(!turn.equals("Q") && healthcount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready:");
			turn = kb.next();
			
		}
	}
	
	public static String takeDamage()
	{
		
	}
	
	public static void printClip()
	{
		
	}
}