public class GMC implements Location
{
	private int x, y;
	
	public GMC()
	{
		x = y = 0;
	}
	
	public GMC(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000)+1;
	}
	
	public void move(int x, int y)
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