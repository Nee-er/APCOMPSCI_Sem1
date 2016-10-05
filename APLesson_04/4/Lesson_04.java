public class Lesson_04
{
	public static void main(String[]args)
	{
		Lesson_04 form = new Lesson_04();
		
		String word1 = "hey";
		double number1 = 4562.2556;
		
		form.format(word1, number1);
		
		String word2 = "blaah";
		double number2 = 6847.54;
		form.format(word2, number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%5s  %10.2f", word, number);
	}
}