import java.util.Scanner;

public class Ex_04
{	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Want to know your BMI? Enter your height in inches:");
		double height = kb.nextDouble();
		
		System.out.println("Now, enter your weight in pounds:");
		double weight = kb.nextDouble();
		
		double bmi = calcBMI(height, weight);
		
		String condition = calcCondish(bmi);
		
		System.out.printf("Your BMI is %.1f\n", bmi);
		System.out.printf("You are " + condition + "\n");
	}
	
	public static double calcBMI(double h, double w)
	{
		return 703*(w/(h*h));
	}
	
	public static String calcCondish(double b)
	{
		if(b < 18.5)
			return "Underweight";
		else if(b < 24.9)
			return "Normal";
		else if(b < 29.9)
			return "Overweight";
		else if(b < 34.9)
			return "Obese";
		else if(b < 39.9)
			return "Very Obese";
		else
			return "Morbidly Obese";
	}
}