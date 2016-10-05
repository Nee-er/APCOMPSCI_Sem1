import java.util.Random;

public class Ex_01
{
	public static void main(String[]args)
	{
		Ex_01 dice = new Ex_01();
		Random rand = new Random ();
		
		int player = rand.nextInt(6)+1;
		int cpu = rand.nextInt(6)+1;
		
		System.out.println("You rolled a "+player+"\nThe computer rolled a "+cpu);
		
		if(rollDice(player, cpu))
		{
			System.out.println("The winner is you!");
		}
		
		if(!rollDice(player, cpu))
		{
			System.out.println("The winner is the computer!");
		}
	}
	
	public static boolean rollDice(int p, int c)
	{
		return p > c;
	}
}