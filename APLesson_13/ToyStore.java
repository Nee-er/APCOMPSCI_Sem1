import java.util.ArrayList;
import java.util.Arrays;
public class ToyStore
{
	private ArrayList<Toy>toyList;
	private String toyStock;
	
	public ToyStore()
	{
		toyStock = "";
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String t)
	{
		toyStock = t;
		loadToys(t);
	}
	
	public void loadToys(String ts)
	{
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i <= toys.size()-1; i++)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Toy t = getThatToy(name);
			if(getThatToy(name).equals(null))
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
				t.setCount(t.getCount() + 1);
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy x : toyList)
		{
			if(x.getName().equals(nm))
			{
				return x;
			}
			else
			{
				return null;
			}
		}
	}
	
	public String getMostFrequentToy()
	{
		String name;
		int max = Integer.MIN_VALUE;
		for(Toy x : toyList)
		{
			if(max < x)
			{
				max = x;
				name.equals(toyList.get(x));
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy x : toyList)
		{
			if(x.equals("Car"))
				cars++;
			if(x.equals("AF"))
				figures++;
		}
		
		if(cars > figures)
		{
			return "Cars";
		}
		if(figures < cars)
		{
			return "Action Figures";
		}
		else
		{
			return "Equal amounts of action figures and cars!";
		}
	}
	
	public String toString()
	{
		return toyList;
	}
}