import java.util.ArrayList;
public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();
	
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(ArrayList<Toy>t)
	{
		toyList = t;
		loadToys(t);
	}
	
	public void loadToys(ArrayList<Toy>ts)
	{
		ArrayList<String> toys = new ArrayList<>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i <= toys.length()-1; i++)
		{
			String name = toys[i];
			String type = toys[i + 1];
			Toy object = new Toy(getThatToy(name));
			if(getThatToy(name).equals(""))
			{
				if(toys[i].equals("Car"))
				{
					toyList.add("Car");
				}
				if(toys[i].equals("AFigure"))
				{
					toyList.add("AF");
				}
			}
			else
				i++;
		}
	}
	
	public static String getThatToy(String nm)
	{
		for(Toy x : toyList)
		{
			if(x.equals(nm))
			{
				return x;
			}
			else
			{
				return "";
			}
		}
	}
	
	public static String getMostFrequentToy()
	{
		String name;
		int max = Integer.MIN_VALUE;
		for(Toy x : toyList)
		{
			if(max < x)
			{
				max = x;
				name.equals(toyList[x]);
			}
		}
		return name;
	}
	
	public static String getMostFrequentType()
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
	
	public static String toString()
	{
		return toyList;
	}
}