import java.util.Scanner;

public class Rectanlge
{
	static double l;
	static double w;
	static double p;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle in feet:");
		
		l = kb.nextDouble();
		
		System.out.println("Enter the width of the rectangle in feet:");
		
		w = kb.nextDouble();
		
		calcPerim();
		
		print();
	}
	
	public static void calcPerim()
	{
		p = (2*l) + (2*w);
	}
	
	public static void print()
	{
		System.out.printf("Your rectanlge is %.5fft around.", p);
	}
}