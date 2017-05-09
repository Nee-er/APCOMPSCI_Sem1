/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card fourOfHearts = new Card("Four", "Hearts", 4);
		Card aceOfClubs = new Card("Ace", "Clubs", 13);
		Card nineOfDiamonds = new Card("Nine", "Diamonds", 9);
		
		System.out.println(aceOfClubs.matches(fourOfHearts)
		+ "\n" + nineOfDiamonds.toString());
	}
}
