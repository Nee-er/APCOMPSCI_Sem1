public class Lab_02
{
	public static void main (String[]args)
	{
		int num1 = 62;
		int num2 = 74;
		int product = num1 * num2;
		
		System.out.println(product);
		
		String name = "Gordon Robinson";
		String address = "123 Sesame Street";
		String city = "New York";
		String state = "NY";
		String zip = "10128";
		
		System.out.println(name +"\n"+ address +", " + city +", "+ state +"\n"+ zip);
		
		int l = 16;
		int w = 34;
		int h = 53;
		int surfaceArea = (l*w*2)+(l*h*2)+(w*h*2);
		
		System.out.println("The surface area of your rectangle is " + surfaceArea);
	}
}