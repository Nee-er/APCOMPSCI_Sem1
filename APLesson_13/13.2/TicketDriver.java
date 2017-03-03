public class TicketDriver
{
	public static void main(String[]args)
	{
		Ticket adv = new Advance(20);
		Ticket wkup = new Walkup();
		StudentAdvance stdnt = new StudentAdvance(30);
		System.out.println(adv + "\n");
		System.out.println(wkup + "\n");
		System.out.println(stdnt + "\n");
	}
}