import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a distance in miles:");
		int distance = kb.nextInt();
		System.out.println("Enter a number of complete hours of travel:");
		int hours = kb.nextInt();
		System.out.println("Enter number of minutes:");
		int minutes = kb.nextInt();
		double mph = 0;
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes, mph);
		
		System.out.println(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + object.getMPH() + " mph");
	}
}