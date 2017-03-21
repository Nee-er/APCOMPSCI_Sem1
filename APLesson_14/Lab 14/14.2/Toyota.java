import java.util.Arrays;
public class Toyota extends Car
{
	private double[] location;
	
	public Toyota()
	{
		super();
		location = new double[2];
	}
	
	public Toyota(String l)
	{
		super();
		location = new double[2];
		String[] locs = l.split(", ");
		location[0] = Double.parseDouble(locs[0]);
		location[1] = Double.parseDouble(locs[1]);
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