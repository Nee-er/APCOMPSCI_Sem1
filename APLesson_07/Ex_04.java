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
		System.out.println("With @s, !s, $s, and 0s... " + sentence);
	}
	
	public static void replace()
	{
		while(sentence.indexOf("a") > 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a") + 1);
		}
		while(sentence.indexOf("s") > 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("s")) + "$" + sentence.substring(sentence.indexOf("s") + 1);
		}
		while(sentence.indexOf("i") > 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("i")) + "!" + sentence.substring(sentence.indexOf("i") + 1);
		}
		while(sentence.indexOf("o") > 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("o")) + "0" + sentence.substring(sentence.indexOf("o") + 1);
		}
		while(sentence.indexOf("e") > 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("e")) + "3" + sentence.substring(sentence.indexOf("e") + 1);
		}
	}
}