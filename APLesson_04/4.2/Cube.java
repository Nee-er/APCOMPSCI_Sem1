import java.util.Scanner;

public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of one side of the cube in feet:");
		
		side = kb.nextDouble();
		
		calcSurf();
		
		print();
	}
	
	public static void calcSurf()
	{
		sa = (side*side)*6;
	}
	
	public static void print()
	{
		System.out.printf("The surface area of a cube with %.5fft sides is %.5fft squared.", side, sa);
	}
}