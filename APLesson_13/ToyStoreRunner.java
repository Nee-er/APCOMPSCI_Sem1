public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore t = new ToyStore("Hotwheel, Car, G.I. Joe, AF, Penny Racer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(t);
		System.out.println("Most Frequent Toy: " + t.getMostFrequentToy());
		System.out.println("Most Frequent Type: " + t.getMostFrequentType());
	}
}