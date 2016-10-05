import java.util.Scanner;

public class Ex_03
{
	public static void main(String[]args)
	{
		Ex_03 loan = new Ex_03();
		
		Scanner kb = new Scanner(System.in);
		
		
		System.out.println("Enter the amount you intend to borrow in dollars:");
		
		double princpl = kb.nextDouble();
		
		System.out.println("Enter the interest rate in decimal form:");
		
		double rate = kb.nextDouble();
		
		System.out.println("Enter the number of times the loan is compounded per year:");
		
		double number = kb.nextDouble();
		
		System.out.println("Enter the period of time the loan will be paid off in years:");
		
		double time = kb.nextDouble();
		
		double payment = loan.calcPay(princpl, rate, number, time);
		
		
		System.out.printf("Your total monthly payment is $%-10.2f\n", payment);
	}
	
	public double calcPay(double p, double r, double n, double t)
	{
		double n1 = 1 + (r/n);
		
		double n2 = Math.pow(n1, n*t);
		
		double n3 = (p * n2); //total amount paidz
		
		double n4 = n3/(12*t); //Monthly payment
		
		return n4;
	}
}