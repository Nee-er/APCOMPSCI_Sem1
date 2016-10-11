import java.util.Random;

public class Ex_01
{
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args)
	{
		Ex_01 dice = new Ex_01();
		Random rand = new Random ();
		
		player = rand.nextInt(6)+1;
		computer = rand.nextInt(6)+1;
		
		rollDice();
		
		System.out.println("You rolled a "+player+"\nThe computer rolled a "+computer);
		
		System.out.println("And the winner is..." + winner);
	}
	
	public static String rollDice()
	{
		if(player>computer)
			winner = "Player";
		if(computer>player)
			winner = "Computer";
		if(player==computer)
			winner = "no one! Everybody loses!";
	}
}