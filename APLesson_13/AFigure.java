public class AFigure extends Toy
{
	private String type;
	
	public AFigure()
	{
		super();
		type = "";
	}
	
	public AFigure(String n)
	{
		super(n);
		type = "Action Figure";
	}
	
	public String getType()
	{
		return type;
	}
	
	public String toString()
	{
		return super.toString() + " " + type;
	}
}