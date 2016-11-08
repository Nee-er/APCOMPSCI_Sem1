import java.util.Scanner;
public class Underscores
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		System.out.println(replace(kb.nextLine()));
	}
	
	public static String replace(String s)
	{
		if(s.indexOf(" ") > 0)
		{
			return s = replace((s.substring(0, s.indexOf(" ")) + "_" + s.substring(s.indexOf(" ") + 1)));
		}	
		return s;
	}
}