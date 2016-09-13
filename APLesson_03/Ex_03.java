import java.util.Scanner;

public class Ex_03
{
	public static void main (String[]args)
	{
		Scanner tipCalc = new Scanner(System.in);
		
		
		System.out.println("Want to how much to leave as tip on your meal? Enter the price of the meal in dollars.");
		
		double price = tipCalc.nextDouble();
		
		double tip = (price * .18);
		
		System.out.println("You should leave a $" + tip + " tip.");
	}
}