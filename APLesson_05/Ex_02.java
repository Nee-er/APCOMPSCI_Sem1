import java.util.Scanner;

public class Ex_02
{
	public static void main(String[]args)
	{
		Ex_02 money = new Ex_02();
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Enter the name of the first item:");
		String item1 = kb.nextLine();
		System.out.println("Enter the price of the first item:");
		double price1 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter the name of the second item:");
		String item2 = kb.nextLine();
		System.out.println("Enter the price of the item:");
		double price2 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter the name of the third item:");
		String item3 = kb.nextLine();
		System.out.println("Enter the price of the item:");
		double price3 = kb.nextDouble();
		kb.nextLine();
		
		System.out.println("Enter the name of the fourth item:");
		String item4 = kb.nextLine();
		System.out.println("Enter the price of the item:");
		double price4 = kb.nextDouble();
		kb.nextLine();
		
		String subtotal = "Subtotal";
		String discount1 = "Discount";
		String total = "Total";
		
		double total1 = price1 + price2 + price3 + price4;
		
		String tax = "Tax";
		double tax1 = (total1*.1);
		
		double total2 = (price1 + price2 + price3 + price4) - (price1+price2+price3+price4)*.15 + tax1;
		double discount2 = (price1+price2+price3+price4)*.15;
		double noDiscount = 0;
		double total3 = total1 + tax1;
		
		System.out.println("\n<<<<<<<<<_Receipt_>>>>>>>>>>>>\n");
		
		money.format(item1, price1);
		money.format(item2, price2);
		money.format(item3, price3);
		money.format(item4, price4);
		
		System.out.println("\n");
		
		money.format(subtotal, total1);
		money.format(tax, tax1);
		
		if(discount(total1))
		{
			money.format(discount1, discount2);
			money.format(total, total2);
		}
		
		if(!discount(total1))
		{
			money.format(discount1, noDiscount);
			money.format(total, total3);
		}
		
		System.out.println("_____________________________________\n          *Thank you for your service*");
	}
	
	public static boolean discount(double c)
	{
		return c > 2000;
	}
	
	public void format(String i, double p)
	{
		System.out.printf("* %15s ......... %15.2f\n", i, p);
	}
}