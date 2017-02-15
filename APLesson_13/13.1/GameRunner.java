public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem elite = new XBox("Scorpio");
		GameSystem pro = new PlayStation("PS4");
		GameSystem W10 = new PC("Alienware");
		System.out.println(elite + "\n");
		System.out.println(pro + "\n");
		System.out.println(W10 + "\n");
	}
}