import java.util.Scanner;

public class Ex_04
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		sentence = kb.nextLine();
		replace();
		System.out.println("With @s... " + sentence);
	}
	
	public static void replace()
	{
		String words = sentence;
		while(sentence.indexOf("a") > 0)
		{
			words = words.substring(0, words.indexOf("a")) + words.substring(words.indexOf("a"));
		}
	}
}