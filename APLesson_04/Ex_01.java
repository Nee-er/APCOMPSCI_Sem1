import java.util.Scanner;

public class Ex_01
{
	public static void main(String[]args)
	{
		Ex_01 form = new Ex_01();
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Please enter item 1:");
		
		String item1 = kb.nextLine();
		
		
		System.out.println("Please enter the price:");
		
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		
		System.out.println("Please enter item 2:");
		
		String item2 = kb.nextLine();
		
		
		System.out.println("Please enter the price:");
		
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		
		System.out.println("Please enter item 3:");
		
		String item3 = kb.nextLine();
		
		
		System.out.println("Please enter the price:");
		
		double price3 = kb.nextDouble();
		kb.nextLine();
		
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>\n\n");
	}
	
	public void format (String item, double price)
	{
		System.out.printf("*%18s ..........\t %3.2f", item, price);
	}
}