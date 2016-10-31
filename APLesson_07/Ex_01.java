import java.util.Scanner;

public class Ex_01
{
	static int number;
	static int sum;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = kb.nextInt();
		sumDigits();
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	
	public static void sumDigits()
	{
		int num = number;
		while(num > 0)
		{
			sum = num % 10 + sum;
			num /= 10;
		}
	}
}