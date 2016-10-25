import java.util.Scanner;

public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number to find its factorial:");
		int number = kb.nextInt();
		int factorial = 1;
		System.out.println("");
		
		for(int i = 1; i <= number; i++)
		{
			System.out.println(i*factorial);
			factorial=i*factorial;
		}
	}
}