import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the hair color:");
		String hair = kb.nextLine();
		System.out.println("Enter the eye color:");
		String eyes = kb.nextLine();
		System.out.println("Enter the skin color:");
		String skin = kb.nextLine();
		
		Human object = new Human("Brown", "Brown", "White");
		System.out.println("My info....\nHair:\t" + object.getHair() + "\nEyes:\t" + object.getEyes() + "\nSkin\t" + object.getSkin());
		
		Human object1 = new Human(hair, eyes, skin);
		System.out.println("Your info....\nHair:\t" + object1.getHair() + "\nEyes:\t" + object1.getEyes() + "\nSkin\t" + object1.getSkin());
	}
}