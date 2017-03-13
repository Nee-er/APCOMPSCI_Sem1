public class Car implements Location
{
	private int ID;
	
	public Car()
	{
		ID = (int)(Math.random()*1000000)+1;
	}
	
	public Car(int i)
	{
		ID = (int)(Math.random()*1000000)+1;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public void move(double x, double y)
	{
		
	}
	
	public double[] getLoc()
	{
		double[] locate = new double[1];
		locate[0] = 0;
		
		return locate;
	}
}