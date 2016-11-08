import java.util.Scanner;
public class Lucky7s
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number to find out how lucky it is:");
		int number = kb.nextInt();
		System.out.println("It's " + luck(number) + " lucky.");
	}
	
	public static int luck(int n)
	{
		if(n > 0)
		{
			if(n % 10 == 7)
			{
				return 1 + luck(n/10);
			}
			return 0 + luck(n/10);
		}
		return 0;
	}
}