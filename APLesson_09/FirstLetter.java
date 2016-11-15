import java.util.Scanner;
public class FirstLetter
{
	public static void main(String[]args)
	{
		String[]words = new String[5];
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter 5 words");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		first(words);
	}
	
	public static void first(String[]n)
	{
		for(String letter : n)
		{
			System.out.println(letter.substring(0,1));
		}
	}
}