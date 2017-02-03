import java.util.ArrayList;
import java.util.Scanner;
public class CountingMachine
{
	public static void main(String[]args)
	{
		double total = 0;
		ArrayList<Money> inventory = new ArrayList<Money>();
		
		inventory.add(new Coin("Penny", "2.5g", 00.01));
		inventory.add(new Bill("Dollar", "Washington", 1.00));
		//there's more but i aint typin that shoot
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your bills and coins...");
		String cash = kb.nextLine();
		Scanner scan = new Scanner(cash);
		
		while(scan.hasNext())
		{
			String x = scan.next();
			
			for(Money b : inventory)
			{
				if(b.scan().equals(x) || b.getName().equals(x))
				{
					b.setCount(b.getCount() + 1);
				}
			}
		}
		
		for(Money x : inventory)
		{
			total += x.getValue() + x.getCount();
		}
		
		System.out.println(total);
	}
}