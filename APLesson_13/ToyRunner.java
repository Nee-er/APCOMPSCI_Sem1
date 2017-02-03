import java.util.ArrayList;
public class ToyRunner
{
	public static void main(String[]args)
	{
		ArrayList<Toy> inventory = new ArrayList<Toy>();
	
		inventory.add(new AFigure("\"Superman\""));
		inventory.add(new Car("\"Lightning McQueen\""));
		
		for(Toy x : inventory)
		{
			System.out.println(x);
		}
	}
}