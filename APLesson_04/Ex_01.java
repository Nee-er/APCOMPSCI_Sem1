import java.util.Scanner;

public class Ex_01
{
	public static void main(String[]args)
	{
		Ex_01 form = new Ex_01();
		
		Scanner kb = new Scanner(System.in);
		
		
		String dots1 = "..........";
		
		
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
		
		
		String Sub = "Subtotal";
		
		double subtotal = (price1+price2+price3);
		
		
		System.out.println("\n\n<<<<<<<<__Receipt__>>>>>>>>>\n");
		
		form.format(item1, price1);
		
		form.format(item2, price2);
		
		form.format(item3, price3);
		
		
		System.out.println("\n");
		
		form.format(Sub, subtotal);
		
		
		String tax = "Tax";
		
		double tax1 = (subtotal*.1);
		
		String total = "Total";
		
		double totes = (subtotal+tax1);
		
		
		form.format(tax, tax1);
		
		form.format(total, totes);
		
		
		System.out.println("_____________________________________\n          *Thank you for your service*");
	}
	
	public void format (String item, double price)
	{
		System.out.printf("* %15s .......... %10.2f\n", item, price);
	}
}