import java.util.Scanner;

public class Ex_06
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word to make a left triangle");
		String word = kb.next();
		System.out.println("");
		
		for(int i = 0; i <= word.length(); i++)
		{
			System.out.println(word.substring(i));
		}
	}
}