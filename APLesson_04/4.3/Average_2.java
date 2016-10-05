import java.util.Scanner;

public class Average_2
{
	public static void main(String[]args)
	{
		Average_2 average = new Average_2();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		
		double num1 = kb.nextDouble();
		
		System.out.println("Enter the second number:");
		
		double num2 = kb.nextDouble();
		
		System.out.println("Enter the third number:");
		
		double num3 = kb.nextDouble();
		
		
		double aveNum = average.calcAve(num1, num2, num3);
		
		average.print(num1, num2, num3, aveNum);
	}
	
	public static double calcAve(double one, double two, double three)
	{
		return (one+two+three)/3;
	}
	
	public void print(double one, double two, double three, double a)
	{
		System.out.printf("The average of %10.5f, %10.5f, and %10.5f is %10.5f.\n", one, two, three, a);
	}
}