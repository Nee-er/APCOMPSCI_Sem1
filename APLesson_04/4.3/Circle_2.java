import java.util.Scanner;

public class Circle_2
{
	public static void main(String[]args)
	{
		Circle_2 area = new Circle_2();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle in feet:");
		
		double radius = kb.nextDouble();
		
		
		double areaFeet = area.calcArea(radius);
		
		area.print(radius, areaFeet);
	}
	
	public static double calcArea(double r)
	{
		return 3.14*Math.pow(r, 2);
	}
	
	public void print(double ra, double ar)
	{
		System.out.printf("The area of a circle with a radius of %10.5fft is %10.5fft squared.\n", ra, ar);
	}
}