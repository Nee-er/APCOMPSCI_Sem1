import java.util.Scanner;

public class Ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an even number to count up to by 2s:");
		int number = kb.nextInt();
		System.out.println("");
		
		for(int i = 2; i <= number; i+=2)
		{
			System.out.printf("%d\t", i);
		}
		
		System.out.println("");
	}
}