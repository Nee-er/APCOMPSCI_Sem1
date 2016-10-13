import java.util.Random;

public class Ex_01
{
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args)
	{
		player = (int)(Math.random()*7)+1;
		computer = (int)(Math.random()*7)+1;
		
		rollDice();
		
		System.out.println("You rolled a "+player+"\nThe computer rolled a "+computer);
		
		System.out.println("The winner is " + winner);
	}
	
	public static void rollDice()
	{
		if(player>computer)
			winner = "you!";
		if(computer>player)
			winner = "the computer!";
		if(computer==player)
			winner = "no one! Everybody loses!";
	}
}