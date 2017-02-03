public class Car extends Toy
{
	private String type;
	
	public Car()
	{
		super();
		type = "";
	}
	
	public Car(String n)
	{
		super(n);
		type = "Car";
	}
	
	public String getType()
	{
		return type;
	}
	
	public String toString()
	{
		return super.toString() + " "+ type;
	}
}