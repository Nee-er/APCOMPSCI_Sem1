public class GMC extends Car
{
	private double x, y;
	
	public GMC()
	{
		super();
		x = y = 0;
	}
	
	public GMC(double x, double y)
	{
		super();
		this.x = x;
		this.y = y;
	}
	
	public void move(double x, double y)
	{
		
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		
		location[0] = x;
		location[1] = y;
		
		return location;
	}
}