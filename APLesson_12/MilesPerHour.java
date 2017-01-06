import static java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MilesPerHour(int dist, int hrs, int min, double mPh)
	{
		distance = dist;
		hours = hrs;
		minutes = min;
		mph = 0;
	}
	
	public void setDistance(int dist)
	{
		distance = dist;
	}
	
	public void setHours(int hrs)
	{
		hours = hrs;
	}
	
	public void setMinutes(int min)
	{
		minutes = min;
	}
	
	public int getDistance()
	{
		return distance;
	}
	
	public int getHours()
	{
		return hours;
	}
	public int getMinutes()
	{
		return minutes;
	}
	
	public double getMPH()
	{
		return mph = (distance /(((hours * 60) + minutes) / 60));
	}
}