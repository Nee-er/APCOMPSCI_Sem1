import java.util.Scanner;

public class Ex_04
{
	public static void main(String[]args)
	{
		Ex_04 volume = new Ex_04();
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Enter the height of the space in inches:");
		
		double height = kb.nextDouble();
		
		System.out.println("Enter the width:");
		
		double width = kb.nextDouble();
		
		System.out.println("Enter the length:");
		
		double length = kb.nextDouble();
		
		double volInch = height * width * length;
		
		
		double volFeet = volume.calcVol(volInch);
		
		System.out.printf("The voulume your speaker can have is %8.3f feet cubed", volFeet);
	}
	
	public double calcVol(double v)
	{
		return v*0.00057870;
	}
}