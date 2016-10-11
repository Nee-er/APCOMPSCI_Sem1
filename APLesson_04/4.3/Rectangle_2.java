import java.util.Scanner;

public class Rectangle_2
{
	public static void main(String[]args)
	{
		Rectangle_2 perimeter = new Rectangle_2();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle in feet:");
		
		double length = kb.nextDouble();
		
		System.out.println("Enter the width:");
		
		double width = kb.nextDouble();
		
		
		double perimFeet = perimeter.calcPerim(length, width);
		
		perimeter.print(perimFeet);
	}
	
	public static double calcPerim(double l, double w)
	{
		return 2*(l+w);
	}
	
	public void print(double p)
	{
		System.out.printf("Your rectangle is %.5fft around.\n", p);
	}
}