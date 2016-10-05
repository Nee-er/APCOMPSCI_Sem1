import java.util.Scanner;

public class Cube_2
{
	public static void main(String[]args)
	{
		Cube_2 surfArea = new Cube_2();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of one side in feet:");
		
		double side = kb.nextDouble();
		
		
		double saFeet = surfArea.calcSurf(side);
		
		surfArea.print(side, saFeet);
	}
	
	public static double calcSurf(double s)
	{
		return 6*(s*s);
	}
	
	public void print(double sF, double sa)
	{
		System.out.printf("The surface area of a cube whose sides are %10.5fft in length is %10.5fft squared.\n", sF, sa);
	}
}