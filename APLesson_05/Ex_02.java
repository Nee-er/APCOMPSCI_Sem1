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
		double price1 = kb.nextInt();
		kb.nextLine();
		
		System.out.println("Enter the name of the second item:");
		String item2 = kb.nextLine();
		System.out.println("Enter the price of the item:");
		double price2 = kb.nextInt();
		kb.nextLine();
		
		System.out.println("Enter the name of the third item:");
		String item3 = kb.nextLine();
		System.out.println("Enter the price of the item:");
		double price3 = kb.nextInt();
		kb.nextLine();
		
		System.out.println("Enter the name of the fourth item:");
		String item4 = kb.nextLine();
		System.out.println("Enter the price of the item:");
		double price4 = kb.nextInt();
		kb.nextLine();
		
		double total1 = price1 + price2 + price3 + price4;
		
		double total2 = (price1 + price2 + price3 + price4) - (price1+price2+price3+price4)*.15;
		
		if(discount(total1))
		{
			money.format(total2);
		}
		
		if(!discount(total1))
		{
			money.format(total1);
		}
	}
	
	public static boolean discount(double p)
	{
		return p > 2000
	}
	
	public void format()
	{
		System.out.printf
	}
}