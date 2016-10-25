public class Ex_08
{
	public static void main(String[]args)
	{
		sing("Na", 4);
		System.out.println("");
		sing("Na", 4);
		System.out.println("");
		sing("Hey", 3);
		System.out.println("");
		sing("Goodbye!", 1);
		System.out.println("");
	}
	
	public static void sing(String w, int n)
	{
		for(int i = 0; i < n; i++)
		{
			System.out.printf("%s ", w);
		}
	}
}