public class LightSaber extends Toy
{
   public LightSaber()
   {
       super();
   }


   public LightSaber(String n)
   {
       super(n);
   }


   public String batteries()
   {
       return "4 AAA";
   }


   public String getType()
   {
       return "Lightsaber";
   }
}