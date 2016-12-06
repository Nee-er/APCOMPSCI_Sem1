public class TwoDee_1
{
	public static void main(String[]args)
	{
		//filling the array
		int[][]values = new int[4][4];
		/* 		
		int num = 1;
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				values[i][j] = num;
				num++;
			}
		}
		*/
		 int num = 1;
		 for(int i = 0; i < values.length; i++)
		 {
			for(int j = 0; j < values[i].length; j++)
			{
				values[j][i] = num;
				num++;
			 }
		 }
		//print out the array
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				System.out.print(values[i][j] + "\t");
			}
			System.out.println();
		}
		
		//search the array
		int count = 0;
		for(int i = 0; i < values.length; i++)
		{
			for(int j = 0; j < values[i].length; j++)
			{
				if(values[i][j] % 5 == 0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " multiples of 5 in the Array.");
	}
}