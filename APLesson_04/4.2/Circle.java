import java.util.Scanner;

public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle in feet:");
		
		r = kb.nextDouble();
		
		calcArea();
		
		print();
	}
	
	public static void calcArea()
	{
		area = 3.14*Math.pow(r,2);
	}
	
	public static void print()
	{
		System.out.printf("The area of a circle with a %10.5fft radius is %10.5fft squared.", r, area);
	}
}