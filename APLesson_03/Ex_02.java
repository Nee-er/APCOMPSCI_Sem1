import java.util.Scanner;

public class Ex_02
{
	public static void main (String[]args)
	{
		Scanner BMIcalc = new Scanner(System.in);
		
		
		System.out.println("Want to know your BMI? Enter your height in inches, press enter, then enter your weight in pounds.");
		
		int height = BMIcalc.nextInt();
		
		int weight = BMIcalc.nextInt();
		
		int BMI = (703 * weight / (height * height));
		
		System.out.println("Your BMI is " + BMI + ". \nYou want to be inbetween 18.5 and 25.");
	}
}