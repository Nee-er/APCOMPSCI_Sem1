import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class KeepComposites
{
	public static void main(String[]args)
	{
		Integer[] numbers = {2, 6, 8, 9, 10, 12, 13, 15, 17, 24, 55, 66, 77, 78, 79};
		ArrayList<Integer> nums = new ArrayList<Integer> 
			(Arrays.asList(numbers));
		
		System.out.println(nums);
	}
	
	public static int gFactor(ArrayList<Integer>n)
	{
		for(int i = 2; i < n.get(14); i++)
		{
			int a = 0;
			if(n.get(a) % i == 0)
			{
				return 1;
			}
			a++;
		}
		return 0;
	}
}