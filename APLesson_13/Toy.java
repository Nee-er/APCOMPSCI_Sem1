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
	
	public void setName(String n)
	{
		this.name = n;
	}
	
	public void setCount(int c)
	{
		this.count = c;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public abstract String getType();
	
	public String toString()
	{
		return "There is " + count + " " + name;
	}
}