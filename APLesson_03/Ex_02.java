import java.util.Scanner;

public class Ex_02
{
	public static void main (String[]args)
	{
		Scanner BMIcalc = new Scanner(System.in);
		
		
		System.out.println("Want to know your BMI? Enter your height in inches.");
		
		double height = BMIcalc.nextInt();
		
		System.out.println("Now, enter your weight in pounds.");
		
		double weight = BMIcalc.nextInt();
		
		double BMI = (703 * weight / (height * height));
		
		System.out.printf("Your BMI is %2.1f. \nYou want it to be between 18.5 and 25.\n", BMI);
	}
}