public class GMC extends Car
{
	private double x, y;
	
	public GMC()
	{
		super();
		x = y = 0;
	}
	
	public GMC(double a, double b)
	{
		super();
		this.x = a;
		this.y = b;
	}
	
	public void move(double x, double y)
	{
		this.x += x;
		this.y += y;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		
		location[0] = x;
		location[1] = y;
		
		return location;
	}
}