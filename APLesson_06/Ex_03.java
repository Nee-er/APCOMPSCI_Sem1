import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word to make a reverse triangle:");
		String word = kb.next();
		System.out.println("");
		
		for(int i = word.length(); i > 0; i--)
		{
			System.out.println(word.substring(0,i));
		}
	}
}