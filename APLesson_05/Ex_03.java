import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your Science letter grade:");
		String science = kb.next();
		
		System.out.println("Enter your Math grade:");
		String math = kb.next();
		
		System.out.println("Enter your History grade:");
		String history = kb.next();
		
		System.out.println("Enter your English grade:");
		String english = kb.next();
		
		System.out.println("Enter your Foreign Language grade:");
		String language = kb.next();
		
		System.out.println("Enter your Elective grade:");
		String elective = kb.next();
		
		System.out.println("Enter your PE grade:");
		String pe = kb.next();
		
		
		double gPoints = (calcPoints(science) + calcPoints(math) + calcPoints(history) + calcPoints(english) + calcPoints(language) + calcPoints(elective) + calcPoints(pe))/7;
		System.out.printf("Your GPA is: %.1f\n", gPoints);
	}
	
	public static double calcPoints(String g)
	{
		if(g.equals("A"))
			return 4.0;
		if(g.equals("B"))
			return 3.0;
		if(g.equals("C"))
			return 2.0;
		if(g.equals("D"))
			return 1.0;
		else
			return 0.0;
	}
}