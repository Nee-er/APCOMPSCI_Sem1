import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a the x-coordinate of one point:");
		int xOne = kb.nextInt();
		System.out.println("Enter a the y-coordinate:");
		int yOne = kb.nextInt();
		System.out.println("Enter a the x-coordinate of another point:");
		int xTwo = kb.nextInt();
		System.out.println("Enter a the y-coordinate:");
		int yTwo = kb.nextInt();
		
		Distance object = new Distance(xOne, yOne, xTwo, yTwo);
		
		System.out.println("distance = " + object.getDist());
	}
}