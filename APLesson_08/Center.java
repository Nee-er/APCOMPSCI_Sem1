import java.util.Scanner;
public class Center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word1 = kb.nextLine();
		System.out.println("Enter another word:");
		String word2 = kb.nextLine();
		System.out.println("Enter another word:");
		String word3 = kb.nextLine();
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));
	}
	
	public static String makeCenter(String s)
	{
		if(s.length()> 20)
			return s;
		return makeCenter(" " + s + " ");
	}
}