import java.util.ArrayList;
public class Satellite
{
   public static void main(String[]args)
   {
       ArrayList<Location> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new Honda(honLoc));
       locate.add(new Toyota("8, 9"));
       locate.add(new GMC(3, 8));

       double[] home = {0, 0};
	   Car c = new Car();
		
		String printout = "\n\n" +
            "==========================" + "\nStarting locations...";

        for (Location l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }

        printout += "\n\n" + "==========================" +
                   "\nDistance from home...";

        for (Location l : locate)
       {
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }

        System.out.println(printout);
		
		System.out.println("\n\n==========================");
		
		for(Location l : locate)
	   {
		   double one = (Math.random()*100)+1;
		   double two = (Math.random()*100)+1;
		   
		   System.out.printf("After %d Moved (%.2f, %.2f)\n", l.getID(), one, two);
		   
		   one += 1;
		   two += 2;
		   
		   System.out.printf("New Location: (%.2f ,%.2f)\n\n\n", one, two);
	   }
   }

    public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }

    public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}