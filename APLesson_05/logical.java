import java.util.Scanner;

public class logical
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		checkNum();
	}
	
	public static void checkNum()
	{
		System.out.println("Pick a number between 1 and 10");
		int guess = kb.nextInt();
		int number = (int)(Math.random()*10)+1;
		if(guess >= 1 && guess <= 10)
		{
			if(guess == number)
			{
				System.out.println("Nice!");
				System.out.println("The number is " + number + "!");
				
			}
			else
			{
				System.out.println("Wrong!");
				System.out.println("The number is " + number);
				checkNum();
			}
		}
		else
		{
			System.out.println("Hey!");
			checkNum();
		}
	}
}