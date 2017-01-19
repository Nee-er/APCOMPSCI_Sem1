import java.util.Scanner;
public class InverntoryDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the item manufacturer:");
		String manufacturer = kb.nextLine();
		System.out.println("Enter the item name:");
		String name = kb.nextLine();
		
		System.out.println("Would you like to enter a category and pricing information? (y or n)");
		String answer = kb.nextLine();
		
		if(answer.equals("y"))
		{
			System.out.println("Enter the item category:");
			String category = kb.nextLine();
			System.out.println("Enter the item price:");
			double price = kb.nextDouble();
			
			Inventory object = new Inventory(manufacturer, name, category, price);
			System.out.println();
			System.out.println(object);
		}
		else
		{
			Inventory object = new Inventory(manufacturer, name);
			System.out.println();
			System.out.println(object);
		}
	}
}