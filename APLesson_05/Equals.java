import java.util.Scanner;

public class Equals
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word1 = kb.next();
		System.out.println("Enter the same word: ");
		String word2 = kb.next();
		
		if(word1.equals(word2))
			System.out.println("The words are the same!");
		else
			System.out.println("The words are not the same!");
	}
}