import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an addition, subtraction, multiplication, or division expression to be solved\nSeperate each charracter with a space:");
		String expression = kb.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		System.out.println(doEquation(equation));
	}
	
	public static ArrayList doEquation(ArrayList<String>n)
	{
		int i = 0;
		while(i < n.size())
		{
			if(n.get(i).equals("*") || n.get(i).equals("/"))
			{
				if(n.get(i).equals("*"))
				{
					n.set(i, "" + (Integer.parseInt(n.get(i-1)) * Integer.parseInt(n.get(i+1))));
					n.remove(i-1);
					n.remove(i);
				}
				else
				{
					n.set(i, "" + (Integer.parseInt(n.get(i-1)) / Integer.parseInt(n.get(i+1))));
					n.remove(i-1);
					n.remove(i);
				}
			}
			else
			i++;
		}
		
		int a = 0;
		while(a < n.size())
		{
			if(n.get(a).equals("+") || n.get(a).equals("-"))
			{
				if(n.get(a).equals("+"))
				{
					n.set(a, "" + (Integer.parseInt(n.get(a-1)) + Integer.parseInt(n.get(a+1))));
					n.remove(a-1);
					n.remove(a);
				}
				else
				{
					n.set(a, "" + (Integer.parseInt(n.get(a-1)) - Integer.parseInt(n.get(a+1))));
					n.remove(a-1);
					n.remove(a);
				}
			}
			else
			a++;
		}
		return n;
	}
}