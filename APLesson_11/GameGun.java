import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class GameGun
{
	static int bulletCount;
	static int CLIPSIZE = 16;
	static int shotCount;
	static String[] clip = new String[CLIPSIZE];
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		resetClip();
		printClip();
		
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action:");
			String action = kb.nextLine();
			
			if(action.equals("r"))
			{
				reload();
			}
			else if(action.equals("s"))
			{
				System.out.println(shoot());
			}
			else
			{
				System.out.println("Enter \"s\" to shoot or \"r\" to reload.");
			}
			System.out.println("");
			printClip();
		}
		
		System.out.println("Out of ammo!");
	}
	
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount-1] = "[]";
			shotCount = shotCount - 1;
			return "Blat!!!";
		}
		else
		{
			return "Reload!!!";
		}
	}
	
	public static void reload()
	{
		if(shotCount == 0) 
		{
			if(bulletCount >= CLIPSIZE)
			{
				bulletCount = bulletCount - CLIPSIZE;
				shotCount = CLIPSIZE;
			}
			else
			{
				shotCount = bulletCount;
				bulletCount = 0;
			}
		}
		else //for you compulsive reloaders(mainly me)
		{
			bulletCount = bulletCount - (CLIPSIZE - shotCount);
			shotCount = CLIPSIZE;
		}
		
		resetClip();
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	
	public static void printClip()
	{
		String output = "";
		output = output + "Bullets:\t" + bulletCount + "\n" + "Clip:\t";
		for(int i = 0; i < CLIPSIZE; i++)
		{
			output = output + clip[i];
		}
		System.out.println(output);
	}
}