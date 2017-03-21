public class Honda extends Car
{
	private double[]location;
	
	public Honda()
	{
		super();
		location = new double[2];
	}
	
	public Honda(double[] l)
	{
		super();
		location = l;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}