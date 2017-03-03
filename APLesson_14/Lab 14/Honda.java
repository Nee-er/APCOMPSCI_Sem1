public class Honda implements Location
{
	private double[]location;
	
	public Honda()
	{
		location = new double[2];
	}
	
	public Honda(double[] l)
	{
		location = l;
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000)+1;
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