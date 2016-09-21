import java.util.Scanner;

public class Ex_02
{
	public static void main(String[]args)
	{
		Ex_02 form = new Ex_02();
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Enter your first name:");
		
		String firstName = kb.nextLine();
		
		System.out.println("Enter your last name:");
		
		String lastName = kb.nextLine();
		
		System.out.println("Enter your title:");
		
		String title = kb.nextLine();
		
		System.out.println("Enter your school:");
		
		String school = kb.nextLine();
		
		System.out.println("Enter the school year:");
		
		String year = kb.nextLine();
		
		System.out.println("What is your subject?");
		
		String subject = kb.nextLine();
		
		
		System.out.println("****************************");
		
		
		form.format(school, year);
		
		form.format(firstName, lastName);
		
		form.format(title, subject);
		
		
		System.out.println("****************************");
	}
	
	public void format (String item, String other)
	{
		System.out.format("* %12s\t%15s *\n", item, other);
	}
}