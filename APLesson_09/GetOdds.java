public class GetOdds
{
	static int[]numbers = new int[10];
	public static void main(String[]args)
	{
		fillArray();
		printArray();
		System.out.println("\n\nThere are " + getOdds() + " odd numbers");
	}
	
	public static void fillArray()
	{
		for(int i =0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray()
	{
		System.out.println("For all of the following numbers...");
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
	}
	
	public static int getOdds()
	{
		int odds = 0;
		
		for(int num : numbers)
		{
			if(num % 2 != 0)
			{
				odds++;
			}
		}
		return odds;
	}
}