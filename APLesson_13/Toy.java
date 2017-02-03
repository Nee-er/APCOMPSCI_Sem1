public abstract class Toy
{
	private String name;
	private int count;
	
	public Toy()
	{
		this.name = "";
		this.count = 1;
	}
	
	public Toy(String t)
	{
		this.name = t;
		this.count = 1;
	}
	
	public String setName()
	{
		return name;
	}
	
	public int setCount()
	{
		return count;
	}
	
	public abstract String getType();
	
	public String toString()
	{
		return "There is " + count + " " + name;
	}
}