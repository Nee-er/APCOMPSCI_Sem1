import java.util.Scanner;

public class Ex_05
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		story();
	}
	
	public static void story()
	{
		System.out.println("While on your travels you come to a fork in the road. \nDo you go Left to the forest or Right to the mountain?");
		String choice = kb.next();
		kb.nextLine();
		if(choice.equals("Left") || choice.equals("Right"))
		{
			if(choice.equals("Right"))
			{
				System.out.println("You take a right and head into the mountains. Night falls before you are able to get out. You freeze to death.");
			}
			if(choice.equals("Left"))
			{
				System.out.println("You turn left and head into the forest.");
				story1();
			}
		}
		else
		{
			System.out.println("Enter Left or Right");
			story();
		}
	}
	
	public static void story1()
	{
		System.out.println("While travelling through the forest you encounter a troll guarding the bridge you must cross. \nDo you Fight him or Talk to him?");
		String choice = kb.next();
		kb.nextLine();
		if(choice.equals("Fight") || choice.equals("Talk"))
		{
			if(choice.equals("Fight"))
			{
				System.out.println("You approach the troll to fight him with your weapon drawn. He raises his club and hits you. You die instantly.");
			}
			if(choice.equals("Talk"))
			{
				System.out.println("You approach the troll to talk to him, and he is actually quite friendly and lets you pass.");
				story2();
			}
		}
		else
		{
			System.out.println("Enter Fight or Talk");
			story1();
		}
	}
	
	public static void story2()
	{
		System.out.println("You are approaching the town you set out for, but the sun is setting. \nDo you Continue or Sleep in the forest?");
		String choice = kb.next();
		kb.nextLine();
		if(choice.equals("Continue") || choice.equals("Sleep"))
		{
			if(choice.equals("Sleep"))
			{
				System.out.println("You lay against a tree and close your eyes. Something kills you in your sleep.");
			}
			if(choice.equals("Continue"))
			{
				System.out.println("You make better time than you expected and arrive in town comfortably before night fall.");
			}
		}
		else
		{
			System.out.println("Enter Sleep or Continue");
			story2();
		}
	}
}