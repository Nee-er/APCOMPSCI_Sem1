import java.util.ArrayList;
public class CountingMachine
{
	public static void main(String[]args)
	{
		ArrayList<Money> inventory = new ArrayList<Money>();
		
		inventory.add(new Coin("Penny", 2.5, 00.01));
		inventory.add(new Bill("Dollar", "Washington", 1.00));
		
		for(Money x : inventory)
		{
			System.out.println(x);
		}
	}
}