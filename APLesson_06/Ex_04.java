import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number to muliply:");
		int number = kb.nextInt();
		System.out.println("Please enter a size for the table:");
		int table = kb.nextInt();
		System.out.printf("\n%4s|%-4s\n", "X", number+" * X");
	
		for(int i = 1; i <= table; i++)
		{
			System.out.printf("%4d|%-4d\n", i, (i*number));
		}
	}
}